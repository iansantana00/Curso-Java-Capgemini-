
package POO2;

public class MainGuitar {

 
    public static void main(String[] args) {
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "Fender";
        
        Guitar ibanez = new Guitar();
        ibanez.chords = 6;
        ibanez.name = "Ibanez";
// Não consegue modificar o objeto fora da classe
    }
    
}
