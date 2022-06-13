
package Atividade22;

import java.util.Scanner;
        
public class Atividade22 {

    public static void main(String[] args) {

        float totalCompra = 0.0f;
        float totalVenda = 0.0f;
                
        Scanner leitor = new Scanner(System.in);
        
        int i = 0; 
        for(; i <= 3; i++){
        // � necess�rio utilizar esse tipo de loop for,
        // para criar a v�riavel i no escopo global, e n�o local
        // para ser utilizada no c�lculo final
        
            System.out.println("Cadastre o nome do produto:");
            String nomeProduto = leitor.next(); 
            
            System.out.println("Cadastre o preço de compra de " 
                    + nomeProduto + " :" );
            float precoCompra = leitor.nextFloat();
            
            System.out.println("Cadastre o preço de venda de " 
                    + nomeProduto + " :");
            float precoVenda = leitor.nextFloat();
            
            totalCompra = totalCompra + precoCompra;
            totalVenda = totalVenda + precoVenda;
            
            if(precoVenda - precoCompra > 0){
                
                System.out.println("Você lucrou " + (precoVenda - precoCompra)
                        + " reais");
            } else {
                if(precoVenda - precoCompra < 0){
                    
                    System.out.println("Você perdeu " 
                            + (precoVenda - precoCompra) + " reais");
                } else {
                    
                    System.out.println("Você não ganhou nem perdeu dinheiro");
                }
            }
        
        }
                        
        System.out.println("A média de compras foi: " + 
                (totalCompra / i) + " reais");
        System.out.println("A média de vendas foi: " + 
                (totalVenda / i) + " reais");
        
    }
    
}
