
package Classes;

import java.util.Scanner;
        
public class Classes {

    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f); //Parâmetro default  
        // variável do tipo Pessoa
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do peso da pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat()); // mudando o peso da pessoa por dentro da classe

        System.out.print("Digite o valor da altura da pessoa: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        objetoPessoa.getPeso(); // Buscar o peso, acessar 
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    
    }
    
}
