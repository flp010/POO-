package br.edu.fatecfranca.test;

import br.edu.fatecfranca.Carro;

public class MainCarro {
    public static void main(String[] args) {
        // INSTANCIAR 2 OBJETOS
        Carro obj1 = new Carro("GM", "Onix", "Branco", 2022, 0);
        Carro obj2 = new Carro("Fiat", "Palio", "Preto", 2022, 0);
        Carro obj3 = new Carro();

        //OS METODOS SÃO CHAMADOS PELOS OBJETOS
        obj1.acelerar(50);
        obj1.frear(20);
        obj1.frear(20);
        obj1.frear(20);
        obj1.frear(20);
        System.out.println(obj1.toString());

        obj2.acelerar(80);
        obj2.frear(30);
        obj2.frear(30);
        obj2.frear(30);
        System.out.println(obj2.toString());
        // obj3.frear();
    }
}
