
package POO;


public class MainUser {

    public static void main(String[] args) {
// Instanciar objeto -> Criar objeto, passar do mundo real para virtual
// Intanciou o objeto User (usuário)

        User userA = new User(); 
//        userA.firstName = "Tiago";
// já não pode acessar diretamente, utiliza a fução
        userA.setFirstName("Tiago");
            
        System.out.print(userA.getFirstName());
    }
    
}
