package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {


    private Statement executorQuery;
    private Connection conn;

    public Database() {
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

}
