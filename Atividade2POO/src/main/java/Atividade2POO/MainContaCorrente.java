
package Atividade2POO;


public class MainContaCorrente {

    public static void main(String[] args) {
    
        ContaCorrente cc =  new ContaCorrente("Angelina", 150, 1500);
        
        System.out.println(cc.getTitular());      
        System.out.println(cc.getExtrato());
        System.out.println(cc.depositar(100));
    }       
}