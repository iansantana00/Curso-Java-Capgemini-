
package Atividade20;

public class Desconto {
    
    int anoFabricacao;
    float valorCarro;
    
    public float CalcularDescontoAte2000(){
        
        float descontoAte2000 = valorCarro * 87 / 100;
        return descontoAte2000;
    }
          
    public float CalcularDescontoAcima2000(){
        
        float descontoAcima2000 = valorCarro * 87 / 100;
        return descontoAcima2000;
    }
}

        
