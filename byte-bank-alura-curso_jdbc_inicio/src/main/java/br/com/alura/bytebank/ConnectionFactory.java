package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarConexao() {

        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/byte_bank?user=root&password=@Ndrey123");
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }
}
