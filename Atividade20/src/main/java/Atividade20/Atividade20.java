W
package Atividade20;

import java.util.Scanner;

public class Atividade20 {

    public static void main(String[] args) {
        
        Desconto objetoDesconto = new Desconto();
        
       String resposta; 
      
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("-------------------------------------------");
        System.out.println("~~~~~~~~ BEM-VINDO A CARANGO VELHO ~~~~~~~~");
        System.out.println("-------------------------------------------");
        System.out.println("Calcule o valor de desconto do Carro que Deseja!");
        System.out.println("-12% para carros fabricados até 2000");
        System.out.println("-7% para carros fabricados acima de 2000");
        System.out.println("");

        System.out.println("Deseja calcular o Desconto (sim / não)? ");
        resposta = leitor.nextLine();
        
        while(resposta != "não"){
            
            System.out.println("Qual o ano do carro desejado? ");
            objetoDesconto.anoFabricacao = leitor.nextInt();

            System.out.println("Qual o valor desse carro? ");
            objetoDesconto.valorCarro = leitor.nextFloat();

            if(objetoDesconto.anoFabricacao <= 2000){

                System.out.println("O valor do Carro COM DESCONTO é "
                        + objetoDesconto.CalcularDescontoAte2000());
            } else {

                System.out.println("O valor do Carro COM DESCONTO é "
                        + objetoDesconto.CalcularDescontoAte2000());
            }
            
            System.out.println("Deseja Calcular o Desconto novamente "
                    + "(sim / não)?");
            resposta = leitor.nextLine();
        }
        
        System.out.print("Volte Sempre!");

    }
    
}
