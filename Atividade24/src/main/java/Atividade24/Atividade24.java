 
package Atividade24;

import java.util.Scanner;
        
public class Atividade24 {

    public static void main(String[] args) {
              
       int numero = 1;
        
       Scanner leitor = new Scanner(System.in);
       
       System.out.println("Executando o Programa...");
               
       while(numero != 00){
    
           System.out.println("Digite um n�mero: ");
      
           numero = leitor.nextInt();
    
           if(numero > 0){
               System.out.println("O n�mero " + numero + " � positivo." );
           } else{
               if(numero < 0){
                   System.out.println("O n�mero " + numero + " � negativo.");
               } else{
                   System.out.println("O n�mero " + numero + " � nulo.");
                   
                   
               }
               
           }
       }
           
    }
    
}
