package br.edu.fatecfranca.ex2;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name;
    private String area;
    private List<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList<>();
    }

    public Curso(int id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.disciplinas = new ArrayList<>();

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {

        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    public void addDisciplina(int id, String name, String sigla, Professor professor){
        this.disciplinas.add(new Disciplina(id, name, sigla, professor));
    }

    public void addAluno(int idDisciplina, Aluno aluno) {
        // Percorre a lista de disciplinas para encontrar a que corresponde ao idDisciplina
        for (Disciplina disciplina : this.disciplinas) {
            if (disciplina.getId() == idDisciplina) {
                // Adiciona o aluno na disciplina correspondente
                disciplina.addAluno(aluno);
                return;  // Sai do método após adicionar o aluno
            }
        }
        System.out.println("Disciplina com id " + idDisciplina + " não encontrada.");
    }
}

