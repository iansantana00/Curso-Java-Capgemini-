package ComandosLeituraGravacao;

import java.util.Scanner;
        
public class ComandosLeituraGravacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();
        
        System.out.println("Texto que ser� exibido no console");
        System.out.print("Texto que ser� exibido no console");
                
    }
    
}
