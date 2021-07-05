package controls;

import models.Categoria;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Db_categorias {

    private Statement executorQuery;
    private Connection conn;

    public Db_categorias() {
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
    private Map<Integer, Categoria> lista_categorias = new HashMap<>();

    public void addCategoria(Integer key, Categoria categoria) {
       String query = "INSERT INTO categoria (id_categoria,descricao_categoria) VALUES (?,?)";

        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, categoria.getId_categ());
            preparedStmt.setString(2, categoria.getDesc_categ());
            preparedStmt.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Categoria retornaUmaCategoria(Integer id){
        ResultSet resultado;
        Categoria recebe = null;
        try {
            resultado = executorQuery.executeQuery("SELECT * from categoria WHERE id_categoria =" + id);

            while(resultado.next()){
                Categoria categoria = new Categoria(resultado.getInt("id_categoria"),
                        resultado.getString("descricao_categoria"));
                recebe = categoria;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return recebe;
    }



    public ArrayList<Categoria> listaCategorias() {
        ArrayList listaCategoria = new ArrayList<Categoria>();
        ResultSet resultado;
        try {
            resultado = executorQuery.executeQuery("SELECT * from categoria");

            while(resultado.next()){
                Categoria categoria = new Categoria(resultado.getInt("id_categoria"),
                        resultado.getString("descricao_categoria"));
                listaCategoria.add(categoria);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaCategoria;
    }


}
