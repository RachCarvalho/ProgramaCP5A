package controls;

import models.Categoria;
import models.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Db_produtos {

    private Map<Integer, Produto> lista_produtos = new HashMap<>();

    private Statement executorQuery;
    private Connection conn;

    public Db_produtos() {
        try {
            String url = "jdbc:mysql://localhost:3306/loja_virtual";
            String usuario = "root";
            String senha = "";
            conn = DriverManager.getConnection(url, usuario, senha);

            executorQuery  = conn.createStatement();
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
    public void addProduto(Produto produto) {
        String query = "INSERT INTO produto (id_produto, codigo, nome, descricao, preco, quantidade, id_categoria) VALUES (?,?,?,?,?,?,?)";


        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, produto.getId_prodt());
            preparedStmt.setString(2, produto.getCodigo());
            preparedStmt.setString(3, produto.getNome());
            preparedStmt.setString(4, produto.getDesc_prodt());
            preparedStmt.setDouble(5, produto.getPreco());
            preparedStmt.setInt(6, produto.getQtd_estoque());
            preparedStmt.setInt(7, produto.getIdCategoria());
            preparedStmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public Produto retornaUmProduto(Integer id_prodt){
        Produto produto = lista_produtos.get(id_prodt);
        return (produto);
    }

    public ArrayList<Produto> listaProdutos() {
        ArrayList listaProdutos = new ArrayList<Produto>();
        ResultSet resultado;
        try {
            resultado = executorQuery.executeQuery("SELECT * from produto");

            while(resultado.next()){
                Produto produto = new Produto(resultado.getInt("id_produto"),
                        resultado.getString("descricao"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaProdutos;
    }
}
