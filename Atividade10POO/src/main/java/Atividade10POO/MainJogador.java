
package Atividade10POO;

import java.util.Date;

public class MainJogador {

    public static void main(String[] args) {
        
        Jogador jog = new Jogador();
        jog.setNome("Ian");
        jog.setPosicao("Lateral");
        jog.setDataNascimento(new Date());
        jog.setNacionalidade("Brasileiro");
        jog.setAltura(1.75f);
        jog.setPeso(79f);
        
        System.out.println(jog.getDados());
    }
    
}
