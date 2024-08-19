package br.edu.fatecfranca;

public class Aluno {
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    public Aluno(){

    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public float notaFinal() {
        return  (this.p1 + this.p2) / 2;
    }
    public String toString(){
        return "Nro aluno: " + this.numeroAluno + " Nome: " + this.nome + " Idade: " + this.idade +
                "\nMédia: " + this.notaFinal() + "\nSItuação: " + this.passou();
    }

    public String passou(){
        return (this.notaFinal() >=6 ? "Aprovado" : "Reprovado"); //Operador Ternario
    }

}

