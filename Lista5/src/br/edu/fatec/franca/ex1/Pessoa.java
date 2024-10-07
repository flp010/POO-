package br.edu.fatec.franca.ex1;

public class Pessoa extends Animal implements ICidadao, IContribuinte, IProfessor{

    //  Extends Animal é herança de codigo-fonte
    //  Implements ICidadao, IContribuinte, e IProfessor é herança de comportamento

    @Override
    public void vota() {
        System.out.println("Pessoa votando no LULA, faz o L!!!");

    }

    @Override
    public void tiraRg() {
        System.out.println("Pessoa tira RG");

    }

    @Override
    public void pagarIR() {
        System.out.println("Pessoa sonega imposto");

    }

    @Override
    public void tiraCPF() {
        System.out.println("Pessoa tira CPF");

    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensina a sonegar imposto");

    }

    @Override
    public void trabalha() {
        System.out.println("Não existe trabalho ruim, o ruim é ter que trabalhar");

    }
}
