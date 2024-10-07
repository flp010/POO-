package teste;

import br.edu.fatec.franca.ex0.*;

public class Main {
    public static void main(String[] args) {

        IJogadorVolei obj1 = new AtletaVolei();
        obj1.levantar();
        obj1.sacar();

        IJogadorBasquete obj2 = new AtletaBasquete();
        obj2.arremessar();
        obj2.cobrarLanceLivre();

        IJogadorVolei obj3 = new AtletaVoleiBasquete();
        obj3.levantar();
        obj3.sacar();



    }
}