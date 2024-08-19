package br.edu.fatecfranca.test;

import br.edu.fatecfranca.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(1012, 19, "Pedro", 7.5f, 8f);
        System.out.println(al1.toString());

        Aluno al2 = new Aluno(1012, 19, "Pedro", 7.1f,4.8f);
        System.out.println(al2.toString());
    }
}
