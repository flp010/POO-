package br.edu.fatec.franca.ex2.teste;
import br.edu.fatec.franca.ex2.Aniverssario;
import br.edu.fatec.franca.ex2.CartaoWeb;
import br.edu.fatec.franca.ex2.DiadosNamorados;
import br.edu.fatec.franca.ex2.Natal;

import java.util.ArrayList;
import java.util.List;

public class MainCartao {
    public static void main(String[] args) {
        DiadosNamorados c1 = new DiadosNamorados("João");
        Natal n1 = new Natal("Mario");
        Aniverssario a1 = new Aniverssario("Mary");

        List<CartaoWeb> Cartao = new ArrayList<CartaoWeb>();
        Cartao.add(c1);
        Cartao.add(n1);
        Cartao.add(a1);

        for (CartaoWeb cartao : Cartao) {
            cartao.ShowMessage();
        }
    }
}
