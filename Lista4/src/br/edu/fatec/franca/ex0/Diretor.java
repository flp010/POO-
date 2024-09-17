package br.edu.fatec.franca.ex0;

// Classe Diretor herda de Funcionario
public class Diretor extends Funcionario {
    private float acoesEmpresa;

    // Construtor padrão
    public Diretor() {
        super(); // Chama o construtor da superclasse
        this.acoesEmpresa = 0;
    }

    // Construtor com parâmetros
    public Diretor(String nome, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(nome, endereco, cpf, salario); // Chama o construtor da superclasse com parâmetros
        this.acoesEmpresa = acoesEmpresa;
    }

    // Getters e Setters
    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    // Sobrescreve o método toString para incluir acoesEmpresa
    @Override
    public String toString() {
        return "\nCargo Diretor" +
                "\nacoesEmpresa: " + acoesEmpresa +
                super.toString();
    }

    // Sobrescreve o método calculaSalario para adicionar ações ao salário
    @Override
    public float calculaSalario() {
        return this.salario + (this.acoesEmpresa * 5) / 12;
    }
}
