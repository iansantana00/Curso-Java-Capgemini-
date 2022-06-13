package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    // Driver irá fazer a ponte/conexão entre a aplicação e o banco de dados
    // mysql -> banco de dados, jdbc -> driver de conexão do java com o bd
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    // caminho de conexão com o banco de dados //porta 3306/nome do bd
    public static final String USER = "root";
    // usuário root 
    public static final String PASS = "";
    // senha vazia 

    // metodo para fazer a conexão com o banco de dados
    // static serve para chamar o método sem fazer uma instância da classe
    public static Connection getConnection() {
        // devolve uma conexão 
        // try, catch -> tratamento de exceção/erros
        try {
            Class.forName(DRIVER);
            // Carregar o Driver que quer conectar ao banco de dados
            return DriverManager.getConnection(URL, USER, PASS);
            // Gerar a conexão com os 3 parâmetros
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com o banco"
                    + " de dados", ex);
        }
    }

    public static void closeConnection(Connection connection) {
        // recebe a conexão e se a conexão existir, ele a fecha
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão"
                    + " com o banco de dados", ex);
        }

    }

    public static void closeConnection(Connection connection,
            PreparedStatement statement) {
        // recebe a conexão e se a conexão existir, ele a fecha
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão"
                    + " com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection,
            PreparedStatement statement, ResultSet resultSet) {
        // recebe a conexão e se a conexão existir, ele a fecha
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão"
                    + " com o banco de dados", ex);
        }
    }
}
