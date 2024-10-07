package br.edu.fatec.franca.ex0;

public class AtletaVoleiBasquete implements IJogadorVolei, IJogadorBasquete {

    @Override
    public void arremessar() {
        System.out.println("Atleta de basquete arremessou");

    }

    @Override
    public void cobrarLanceLivre() {
        System.out.println("Atleta de basquete cobrou um lance livre");

    }

    @Override
    public void sacar() {
        System.out.println("Ateleta de volei sacou");

    }

    @Override
    public void levantar() {
        System.out.println("Atleta de volei levantou");

    }
}
