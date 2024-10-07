package br.edu.fatec.franca.ex3;

public class EstacaoClima implements Clima {
    private EstacaoAno estacao;

    public EstacaoClima(EstacaoAno estacao) {
        this.estacao = estacao;
    }

    @Override
    public void temSol() {
        System.out.println("Esta estação também pode ter dias ensolarados.");
    }

    @Override
    public void temFrio() {
        if (estacao instanceof Inverno) {
            System.out.println("Esta estação tem dias frios.");
        } else {
            System.out.println("Esta estação normalmente não tem frio.");
        }
    }

    @Override
    public void temCalor() {
        if (estacao instanceof Verao) {
            System.out.println("Esta estação tem dias muito quentes.");
        } else {
            System.out.println("Esta estação não tem dias quentes.");
        }
    }
}
