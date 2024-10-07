package br.edu.fatec.franca.testa;

import br.edu.fatec.franca.ex3.*;

public class TestaClima {
    public static void main(String[] args) {
        // Instâncias das estações do ano
        EstacaoAno verao = new Verao();
        EstacaoAno inverno = new Inverno();
        EstacaoAno outono = new Outono();
        EstacaoAno primavera = new Primavera();

        // Usando o adaptador para que as estações possam ter comportamentos de clima
        Clima climaVerao = new EstacaoClima(verao);
        Clima climaInverno = new EstacaoClima(inverno);
        Clima climaOutono = new EstacaoClima(outono);
        Clima climaPrimavera = new EstacaoClima(primavera);

        // Testando comportamentos do verão
        System.out.println("Verão:");
        verao.climaPrincipal();
        climaVerao.temSol();
        climaVerao.temCalor();
        climaVerao.temFrio();

        // Testando comportamentos do inverno
        System.out.println("\nInverno:");
        inverno.climaPrincipal();
        climaInverno.temSol();
        climaInverno.temCalor();
        climaInverno.temFrio();

        // Testando comportamentos do outono
        System.out.println("\nOutono:");
        outono.climaPrincipal();
        climaOutono.temSol();
        climaOutono.temCalor();
        climaOutono.temFrio();

        // Testando comportamentos da primavera
        System.out.println("\nPrimavera:");
        primavera.climaPrincipal();
        climaPrimavera.temSol();
        climaPrimavera.temCalor();
        climaPrimavera.temFrio();
    }
}

