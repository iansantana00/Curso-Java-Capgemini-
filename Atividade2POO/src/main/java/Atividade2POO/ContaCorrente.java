
package Atividade2POO;

public class ContaCorrente {
    
    private String titular;
    private float saldo;
    private float limite;
    
    public ContaCorrente(String titular, float saldo, float limite){
        
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;    
    }
    
    public String getTitular(){
        return titular;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public float getLimite(){
        return limite;
    }
    
    public String getExtrato(){
        return("Saldo de " + saldo + " do titular " + titular +
                " com o limite de " + limite);
    }
    
    public void depositar(float valor){
        
        if(valor > 0){
            saldo += valor;
        } else{
            System.out.println("O número precisa ser positivo");
        }
    }
    
    public void setSacar(float valor){
        if(valor > 0){
            if(saldo >= valor){
                saldo -= valor;
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("O valor deve ser positivo");
        }
    }
}

