 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.Task;
import util.ConnectionFactory;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.management.RuntimeErrorException;
import java.util.ArrayList;

/**
 *
 * @author iansa
 */
public class TaskController {

    private Connection connection;

    // os dados que estão dentro do objeto task são os que serão salvos
    public void save(Task task) {

        String sql = "INSERT INTO tasks (idProject, "
                + "name,"
                + "description, "
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        // sempre que tiver variáveis sem valores, mas que planeja add
        // um valor no sql, coloca-se ?

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            // Preparando a query
            statement = connection.prepareStatement(sql);
            // Setando os valores do statment
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            // Criar nova data para converter a classe Date do java.util 
            // para o sql, getTime retorna a data 
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getCreatedAt().getTime()));
            statement.setInt(9, task.getId());
            // Executando a query
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa "
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
            // fechar a conexão
        }
    }

    public void upadte(Task task) {
        // atualizar

        String sql = "UPDATE tasks SET "
                + "idProject = ?, "
                + "name = ?, "
                + "notes = ?, "
                + "completed = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updateAt = ?, "
                + "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa " +
                    ex.getMessage(), ex);

        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Estabelecer conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            // Preparar o comando query
            statement = connection.prepareStatement(sql);
            // Substituir a interrogação (primeira) 
            // do sql por outro parâmetro escolhido (como id)
            // Setando os valores
            statement.setInt(1, taskId);
            // Executando a query
            statement.execute();
            // Tratar qualquer exceção  
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa"
                    + ex.getMessage(), ex);
            // Executado sempre no final do bloco try, independente do erro
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<Task> getALL(int idProject) {
        // Buscar todas as tarefas com base no projeto 
        // Retorna uma lista de tarefas
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection connection = null;
        PreparedStatement statement = null; 
        // Guarda as respostas/valores do banco de dados
        ResultSet resultSet = null;
        
        // Lista de tarefas que será devolvida quando a chamada do 
        // método acontecer 
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            // estabelecer conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            // preparou o sql
            statement = connection.prepareStatement(sql);
            // setar o id do projeto
            // setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
            // valor retornado pela execução da query
            // Devolver o valor de resposta do resultSet (SELECT do bd)
            resultSet = statement.executeQuery();
            
            // Enquanto houverem valores a serem percorridos no meu resulSet
            while(resultSet.next()) {
                // setar um registro e ir para próximo até acabar
                
                // trazer as informções do banco dados para o sistema
                
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
            
                // Colocar os task dentro da lista 
                tasks.add(task);
            }
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir a tarefa " +
                    ex.getMessage(), ex);   
        } finally {
            ConnectionFactory.closeConnection(connection, statement,
                    resultSet);
        }
        
        // Lista de tarefas que foi criada e carregada do banco 
       // de dadosss 
        return tasks;
    }
}
