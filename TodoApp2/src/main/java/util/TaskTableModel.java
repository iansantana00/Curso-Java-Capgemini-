/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;
import view.Tasks;

/**
 *
 * @author iansa
 */
// mostrar tarefas de cada projeto
public class TaskTableModel extends AbstractTableModel {

// lista de tarefas que serão carregadas no banco 
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"
    };
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
// retornar numero de tarefas que tem 
    }

    @Override
    public int getColumnCount() {
        return columns.length;
// retornar número de colunas
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

// Fazer com que as celula/colunas da JTable é editável 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    // Pegar a linha, retornar a classe do dado 
    }

// Retornar a classe do componente que está em determinada col una 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            // retornar o dado da coluna  
            case 0:
                // coluna 1
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados";
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        // Receber o valor falso/verdadeiro a linha e a coluna atribuida  
        // Pegar a tarefa correspondente a linha
        // Faz a conversao do dado para object
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    // não gerar set das colunas, pois não devem ser alteradas via código
    public void setTasks(List<Tasks> tasks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTasks(List<Tasks> tasks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
