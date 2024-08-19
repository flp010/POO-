package br.edu.fatecfranca.test;

import br.edu.fatecfranca.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio("Canoas", 10f, true);
        Rio rio2 = new Rio("Grande", 50f, false);
        System.out.println(rio1.toString());
        rio1.chover(10f);
        rio1.ensolarar(19f);
        rio1.limpar();
        rio1.sujar();
        rio1.limpar();
        System.out.printf(rio1.toString());
        System.out.println(rio2.toString());
        rio2.chover(2f);
        rio2.ensolarar(60f);
        rio2.limpar();
        rio2.sujar();
        rio2.chover(78f);
        rio2.sujar();
        System.out.println(rio2.toString());



    }
}
