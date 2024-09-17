package br.edu.fatec.franca.ex3.teste;

import br.edu.fatec.franca.ex3.Produto;
import br.edu.fatec.franca.ex3.Radio;
import br.edu.fatec.franca.ex3.TV;

public class MainProduto {
    public static void main(String[] args) {
        Produto prod;
        prod = new Radio(111, 222, 96.5f, "FM");
        prod.testaUnidade();
        System.out.println(prod); // Chama toString() da class radio

        prod = new TV(888, 999, 539);
        prod.testaUnidade();
        System.out.println(prod); // Chama toString() da classe tv
    }
}
