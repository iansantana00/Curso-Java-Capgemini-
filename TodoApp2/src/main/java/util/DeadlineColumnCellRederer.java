/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JLabel;
import javax.swing.JTable;
import model.Task;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author iansa
 */
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer {
    
    // Devolve o componente que será mostrado naquela celula
    @Override
    public Component getTableCellRendererComponent (JTable table, 
            Object value, boolean isSelected, boolean hasFocus, int row, int col) {
    
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table,
                value, isSelected, hasFocus, row, col);
        label.setHorizontalAlignment(CENTER);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        
        if(task.getDeadline().after(new Date())) {
            label.setBackground(Color.GREEN);
        } else {
            label.setBackground(Color.RED); 
        }
        return label;
    }   
}
