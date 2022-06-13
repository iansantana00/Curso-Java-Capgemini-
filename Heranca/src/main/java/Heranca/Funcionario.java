
package Heranca;
// serve para evitar repetição de codigo para tipos iguais
// motorista e vendedor são do tipo funcionários
// não precisa criar os mesmo atributos para cada um deles
// cria uma classe funcionário que irá herdar seus atributos para motorista e vendedor
// só utiliza nos atributos da classe motorista e vendedor as suas informções específicas
// exemplo: vendedor irá receber comissao e total de vendas, algo que motorista não irá receber 
import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;

    public String getNome() {
        return nome;
    }
    
    // void quer dizer que não tem retorno, é vazio
    public void setNome(String nome) { 
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}

