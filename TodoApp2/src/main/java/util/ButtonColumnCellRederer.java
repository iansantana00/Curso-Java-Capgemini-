/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author iansa
 */
public class ButtonColumnCellRederer extends DefaultTableCellRenderer{
    
    private String buttonType;

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent (JTable table, 
            Object value, boolean isSelected, boolean hasFocus, int row, int col) {
    
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table,
                value, isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(jLabel.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/" + buttonType + ".png")));
        // Retornara o caminho da pasta do butão type que quer rederizar 
        
        
        return label;
        
        
}
