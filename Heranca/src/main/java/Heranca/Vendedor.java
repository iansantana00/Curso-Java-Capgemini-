
package Heranca;
// serve para evitar repetição de codigo para tipos iguais
// motorista e vendedor são do tipo funcionários
// não precisa criar os mesmo atributos para cada um deles
// cria uma classe funcionário que irá herdar seus atributos para motorista e vendedor
// só utiliza nos atributos da classe motorista e vendedor as suas informções específicas
// exemplo: vendedor irá receber comissao e total de vendas, algo que motorista não irá receber 

import java.util.Scanner;

public class Vendedor extends Funcionario {
    
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor() {
        super(); // obter os atributos do funcionario 
    
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
    public float calcularSalario(){
        return super.getSalario() + (
                this.comissaoPorItem * this.totalItensVendidos);
        
        
        
    }
}
