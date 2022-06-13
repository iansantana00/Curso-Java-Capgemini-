
package Atividade15;

import java.util.Scanner;


public class Atividade15 {

    
    public static void main(String[] args) {
                
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Digite um n�mero: ");
                
        numero = leitor.nextInt();
        
        if(numero <= 100 && numero >= 1){
            System.out.println("O n�mero est� no intervalo de 1 a 100.");
            
        } else{
            System.out.println("O n�mero n�o est� no intervalo de 1 a 100.");
        }

    }
    
}
