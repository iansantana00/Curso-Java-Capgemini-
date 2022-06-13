
package Atividade10POO;

import java.util.Date;

public class Jogador {
    private String nome;
    private String posicao;
    private Date dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    
    
    public String getDados(){
        return ("Nome: " + nome + "\nPosicao: " + posicao + 
                "\nData nascimento: " + dataNascimento + "\nNacionaliade: "
                + nacionalidade + "\nAltura: " + altura + "\nPeso: " + peso);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getPosicao(){
        return posicao;
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public float getAltura(){
        return altura; 
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
}

