/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade1POO;

public class MainPessoa {

    public static void main(String[] args) {

        Pessoa pes = new Pessoa("Ian", "07/06/2002", 1.75f);
        // pes é uma variável, pode ter qualquer nome 
        
        System.out.println(pes.getImprimir());
    }
    
}
