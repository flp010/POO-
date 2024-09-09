package br.edu.fatec.franca;

public class Gerente extends Funcionario {
    private float bonus;


    public Gerente() {
        super();  // Chama o construtor sem parametros da superclasse
        this.bonus = 0;
    }

    public Gerente (String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario); // Chama o construtor com parâmetros da superclasse
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "\nCargo Gerente: " +
                "\nbonus: " + bonus +
                super.toString();
    }

    @Override
    public float calculaSalario() {
        return salario + bonus;
    }
}