package br.edu.fatec.franca.ex0;

public class AtletaFutebol implements IJogardoFutebol {

    @Override
    public void baterPenalti() {
        System.out.println("Jogador de futebol batendo penalti ...");

    }

    @Override
    public void baterEscanteio() {
        System.out.println("Jogador de futebol batendo escanteio ...");

    }
}
