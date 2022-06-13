
package Classes;

public class Pessoa {
// torna público os atributos, podem ser alterados 
// utiliza o private para as informações não ser acessíveis fora da classe
    
    // Atributos 
    private float peso;
    private float altura;
    
    // Método construtor deve ter o mesmo nome da classe 
    // Passar valores default
    public Pessoa(float peso, float altura){
        this.peso = peso; // this serve para acessar os atributos criados acima
        this.altura = altura;
    }
    // Método -> Função / Procedimento
    public float calcularIMC(){
    
        float imc = peso / (altura * altura);
        return imc;
    }
    
    // Métodos acessores get e set 
    // set irá modificar o peso
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    // get irá acessar e retornar o peso
    public float getPeso(){ 
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }

}
