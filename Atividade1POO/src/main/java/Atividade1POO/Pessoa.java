
package Atividade1POO;

public class Pessoa {
    
    private String nome;
    private String dataNascimento;
    private float altura;
  
    public Pessoa(String nome, String dataNascimento, 
            float altura){
        
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setAltura(altura);
    }
// public class e a public devem ter o mesmo nome
    
    public String getImprimir(){   
        
        return ("Nome: " + (nome) + "\nData Nascimento: " + (dataNascimento) + "\nAltura(cm): " + (altura));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
