package br.edu.fatecfranca.exe1;

public class Aluno {
    private int NroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno() {

    }

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2){
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public int getNroAluno() {
        return NroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public void setNroAluno(int nroAluno) {
        if (String.valueOf(nroAluno).length() == 6){
            NroAluno = nroAluno;
        }
        else{
            throw new IllegalArgumentException("Número do aluno deve ter 6 digitos");
        }

    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else{
            throw new IllegalArgumentException("Nome do aluno deve ter menos que 30 digitos");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        }
        else{
            throw new IllegalArgumentException("idade do aluno deve ser positiva");
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0 && p1 <= 10){
            this.p1 = p1;
        }
        else{
            throw new IllegalArgumentException("P1 do aluno deve ser positivo ou igual e menor que 10");
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0 && p2 <= 10){
            this.p2 = p2;
        }
        else{
            throw new IllegalArgumentException("P2 do aluno deve ser positivo ou igual e menor que 10");
        }
    }

    public void notaFinal(){
        float total = 0f;
        total += (this.p1 + this.p2) / 2;
        System.out.println("A média da prova 1 com nota " + this.p1 + " E a média da prova 2 com nota, "+ this.p2 + " é: " + total);


    }

    public void dadosAluno(){
        System.out.println("Número: " + this.getNroAluno() + " \nNome: " + this.getNome() + " \nIdade: " + this.getIdade());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "NroAluno=" + NroAluno +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}