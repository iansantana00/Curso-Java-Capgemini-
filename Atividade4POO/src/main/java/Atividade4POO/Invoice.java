    
package Atividade4POO;


public class Invoice {
    
    private int numeroItemFaturado;
    private String descricao;
    private int quantidade;
    private float precoUnitario;
    
    public Invoice(int numeroItemFaturado, String descricao,
            int quantidade, float precoUnitario){
        
        this.setNumeroItemFaturado(numeroItemFaturado);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }

    public double getInvoiceAmount(){
        return quantidade * precoUnitario;
    }
    
    public int getNumeroItemFaturado(){
        return numeroItemFaturado;
    }
    
    public void setNumeroItemFaturado(int NumeroItemFaturado){
        this.numeroItemFaturado = numeroItemFaturado;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){       
        if(quantidade < 0){
            this.quantidade = 0;
        } else{
            this.quantidade = quantidade;
        }
    }
    
    public float getPrecoUnitario(){
        return precoUnitario;
    }
    
    public void setPrecoUnitario(float precoUnitario){
        // validação
        if(precoUnitario < 0){
            this.precoUnitario = 0;
        } else{
            this.precoUnitario = precoUnitario;
        }
    }
// Os melhores lugares para fazer validações são nos get e set  
}
