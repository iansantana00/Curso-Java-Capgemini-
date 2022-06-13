
package POO;

public class User {
    
// classe é um molde, um tipo geral
// membros - propriedades e métodos (comportamento) 
    private String firstName;

// ao invés de alterar o objeto diretamente se cria uma função setter passando
// como parâmetro a propriedade que se quer alterar 
 
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
// quer alterar o primeiro nome que é uma String
// utiliza a função toUpperCase() para deixar todas as letras maiúculas 
    }
    
// para retornar a propriedade alterada utiliza o método get com o tipo que irá
// retornar que no caso é String
    
    public String getFirstName(){
        return firstName;
    }
    
}

