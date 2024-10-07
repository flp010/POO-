package br.edu.fatec.franca.ex0;

public class AtletaBasquete implements IJogadorBasquete {

    @Override
    public void arremessar() {
        System.out.println("Jogador Basquete arremessando ...");

    }

    @Override
    public void cobrarLanceLivre() {
        System.out.println("Jogador Basquete cobrando Lance Livre ...");

    }
}
