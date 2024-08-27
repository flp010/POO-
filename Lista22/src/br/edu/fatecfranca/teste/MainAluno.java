package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {

        Aluno al1 = new Aluno();

        try{
            al1.setNroAluno(123456);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            al1.setNome("Carson");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            al1.setIdade(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            al1.setP1(5.9f);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try{
            al1.setP2(4.8f);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Número: " + al1.getNroAluno() + "\nNome: " + al1.getNome() + "\nIdade: " + al1.getIdade());
        al1.notaFinal();
    }
}
