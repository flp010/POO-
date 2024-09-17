package br.edu.fatec.franca.ex0;

// Classe Assistente herda de Funcionario
public class Assistente extends Funcionario {
    private float horaExtra;

    // Construtor padrão
    public Assistente() {
        super(); // Chama o construtor da superclasse
    }

    // Construtor com parâmetros
    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario); // Chama o construtor da superclasse com parâmetros
        this.horaExtra = horaExtra;
    }

    // Getters e Setters
    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    // Sobrescreve o método toString para incluir horaExtra
    @Override
    public String toString() {
        return "\nCargo: Assistente: " +
                "\nhoraExtra: " + horaExtra +
                super.toString();
    }

    // Sobrescreve o método calculaSalario para adicionar horas extras ao salário
    @Override
    public float calculaSalario() {
        return this.salario + this.horaExtra * 40.0f;
    }
}
