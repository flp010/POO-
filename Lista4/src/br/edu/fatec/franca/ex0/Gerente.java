package br.edu.fatec.franca.ex0;

// Classe Gerente herda de Funcionario
public class Gerente extends Funcionario {
    private float bonus;

    // Construtor padrão
    public Gerente() {
        super(); // Chama o construtor da superclasse
        this.bonus = 0;
    }

    // Construtor com parâmetros
    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario); // Chama o construtor da superclasse com parâmetros
        this.bonus = bonus;
    }

    // Getters e Setters
    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    // Sobrescreve o método toString para incluir bonus
    @Override
    public String toString() {
        return "\nCargo Gerente: " +
                "\nbonus: " + bonus +
                super.toString();
    }

    // Sobrescreve o método calculaSalario para adicionar bônus ao salário
    @Override
    public float calculaSalario() {
        return salario + bonus;
    }
}
