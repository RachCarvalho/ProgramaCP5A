import controls.Ge_estoque;
import models.Categoria;
import controls.Db_categorias;
import controls.Db_produtos;
import models.Produto;

import java.util.Scanner;

public class Main {
    static Db_categorias categorias = new Db_categorias();
    static Db_produtos produtos = new Db_produtos();
    static Ge_estoque ge_estoque = new Ge_estoque();


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Problema conexão");
        }

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("----LOJA REVISTA LUIZA----");

            System.out.println("Seja bem-vindo! \nO que você deseja fazer?");
            System.out.println("1 - Cadastrar uma nova categoria");
            System.out.println("2 - Listar todas as categorias cadastradas");
            System.out.println("3 - Cadastrar um novo produto");
            System.out.println("4 - Listar todos os produtos cadastrados");
            System.out.println("5 - Listar todos os produtos em estoque");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            process(option);
        } while (option != 0);
    }

    static void process(int option) {
        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual a descrição da Categoria?");
                String desc = scanner.nextLine();
                System.out.println("Qual a ID da Categoria?");
                Integer id = scanner.nextInt();

                Categoria categoria = new Categoria(id, desc);
                categorias.addCategoria(categoria.getId_categ(), categoria);

                break;
            }
            case 2: {
               System.out.println("Esses são os tipos de produtos da nossa loja: ");

                System.out.println(categorias.listaCategorias());

                System.out.println("-------------------------------------");
                break;
            }
            case 3: {
               Scanner scanner = new Scanner(System.in);

                System.out.println("Qual a descrição do Produto?");
                String desc = scanner.nextLine();
                System.out.println("Qual o codigo do Produto?");
                String codigo = scanner.nextLine();
                System.out.println("Qual o nome do Produto?");
                String nome = scanner.nextLine();
                System.out.println("Qual a ID do Produto?");
                Integer id = scanner.nextInt();
                System.out.println("Qual o preço do Produto?");
                Double preco = scanner.nextDouble();
                System.out.println("Escolha a ID da categoria do Produto?" + categorias.listaCategorias());
                Integer cat = scanner.nextInt();
                System.out.println("Qual a quantidade disponivel do Produto?");
                Integer qtd = scanner.nextInt();
                System.out.println(categorias.retornaUmaCategoria(cat));
                String add = scanner.nextLine();

                Produto produto = new Produto(id, codigo, nome, desc, preco, categorias.retornaUmaCategoria(cat), qtd);
                produtos.addProduto(produto);

                break;
            }
            case 4: {
                System.out.println("Esses são os produtos da nossa loja: ");

                System.out.println(produtos.listaProdutos());

                System.out.println("-------------------------------------");
                break;
            }
            case 5: {
                System.out.println("Esses são os produtos em estoque: ");

                System.out.println(ge_estoque.todoEstoque());

                System.out.println("-------------------------------------");
                break;
            }
        }
    }
}

//        Categoria categoria1 = new Categoria(1, "Bolo");
//        Categoria categoria2 = new Categoria(2, "Biscoitos");
//        Categoria categoria3 = new Categoria(3, "Geléias");
//        Categoria categoria4 = new Categoria(4, "Tortas");
//        categorias.addCategoriaLista(categoria1.getId_categ(), categoria1);
//        categorias.addCategoriaLista(categoria2.getId_categ(), categoria2);
//        categorias.addCategoriaLista(categoria3.getId_categ(), categoria3);
//        categorias.addCategoriaLista(categoria4.getId_categ(), categoria4);
//
//        Produto produto1 = new Produto(1, "Bolo de Banana", 3.90, categorias.retornaUmaCategoria(3), 7);
//        Produto produto2 = new Produto(2, "Gel. de Amora", 12.90, categorias.retornaUmaCategoria(3), 14);
//        Produto produto3 = new Produto(3, "Cookies", 7.90, categorias.retornaUmaCategoria(2), 10);
//        Produto produto4 = new Produto(4, "Torta Alemã", 9.90, categorias.retornaUmaCategoria(4), 6);
//        Produto produto5 = new Produto(5, "B. de Chocolate", 3.90, categorias.retornaUmaCategoria(1), 3);
//        Produto produto6 = new Produto(6, "Torta Avelã", 9.90, categorias.retornaUmaCategoria(4), 5);
//        Produto produto7 = new Produto(7, "Amanteigados", 7.90, categorias.retornaUmaCategoria(2),12);
//        Produto produto8 = new Produto(8, "Gel de Damasco", 12.90, categorias.retornaUmaCategoria(3), 20);
//        Produto produto9 = new Produto(9, "Torta Maçã", 9.90, categorias.retornaUmaCategoria(4), 8);
//        Produto produto10 = new Produto(10, "Casadinhos", 7.90, categorias.retornaUmaCategoria(2), 25);
//        produtos.addProdutoLista(produto1.getId_prodt(), produto1);
//        produtos.addProdutoLista(produto2.getId_prodt(), produto2);
//        produtos.addProdutoLista(produto3.getId_prodt(), produto3);
//        produtos.addProdutoLista(produto4.getId_prodt(), produto4);
//        produtos.addProdutoLista(produto5.getId_prodt(), produto5);
//        produtos.addProdutoLista(produto6.getId_prodt(), produto6);
//        produtos.addProdutoLista(produto7.getId_prodt(), produto7);
//        produtos.addProdutoLista(produto8.getId_prodt(), produto8);
//        produtos.addProdutoLista(produto9.getId_prodt(), produto9);
//        produtos.addProdutoLista(produto10.getId_prodt(), produto10);

//                if(add.toLowerCase().equals("sim")) {
//                    Estoque estoque = new Estoque(id,produto);
//                    ge_estoque.addProdtEstoque(id, produto);
//                } produto.getId_prodt());

