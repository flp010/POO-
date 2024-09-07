package br.edu.fatecfranca.ex2;

public class Aluno {
    private int ra;
    private String name;
    private String username;

    public Aluno() {
    }

    public Aluno(int ra, String name, String username) {
        this.ra = ra;
        this.name = name;
        this.username = username;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
