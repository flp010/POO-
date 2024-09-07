package br.edu.fatecfranca.ex2;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private String sigla;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina() {
        this.alunos = new ArrayList<>();  //Alocar memória no constructor vazio para o array
    }

    public Disciplina(int id, String nome, String sigla, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.professor = professor;
        this.alunos = (alunos != null) ? alunos : new ArrayList<>();  // Inicializa a lista de alunos
    }


    public Disciplina(int id, String nome, String sigla, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getSigla() {

        return sigla;
    }

    public void setSigla(String sigla) {

        this.sigla = sigla;
    }

    public Professor getProfessor() {

        return professor;
    }

    public void setProfessor(Professor professor) {

        this.professor = professor;
    }
    public List<Aluno> getAlunos() {

        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {

        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }

    //Adiciona um aluno em (alunos[vetor])
    public void addAluno(Aluno aluno) {
        if(this.alunos == null){
            this.alunos = new ArrayList<>();
        }
        this.alunos.add(aluno);
    }
}
