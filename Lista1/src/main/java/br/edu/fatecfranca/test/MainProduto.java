package br.edu.fatecfranca.test;

import br.edu.fatecfranca.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, "Arroz", 10, 50.00f);
        Produto prod2 = new Produto(2, "Feijão", 2, 50.00f);
        System.out.println(prod1.toString());
        prod1.comprar(5);
        System.out.println(prod1.toString());
        prod1.vender(15);
        System.out.println(prod1.toString());
        prod1.subir(10f);
        System.out.println(prod1.toString());
        prod1.descer(59f);
        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        prod2.comprar(41);
        System.out.println(prod2.toString());
        prod2.vender(32);
        System.out.println(prod2.toString());
        prod2.subir(9.99f);
        System.out.println(prod2.toString());
        prod2.descer(10.50f);
        System.out.println(prod2.toString());


    }
}
