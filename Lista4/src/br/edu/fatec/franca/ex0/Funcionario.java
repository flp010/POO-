package br.edu.fatec.franca.ex0;

// Classe Funcionario é a superclasse para Diretor, Gerente e Assistente
public abstract class Funcionario { // Se na prova a classe estiver em italico é classe abstrata
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected float salario;

    // Construtor padrão inicializando as variaveis apenas como vazio ("")
    public Funcionario() {
        this.nome = "";
        this.endereco = "";
        this.cpf = "";
        this.salario = 0;
    }

    // Construtor com parâmetros
    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Sobrescreve o método toString para exibir informações do funcionário
    @Override
    public String toString() {
        return "\nnome: " + nome +
                "endereco: " + endereco +
                "cpf: " + cpf +
                "salario: " + this.salario +
                " Salario mais beneficios do cargo: " + calculaSalario();
    }

    // Método calculaSalario, que pode ser sobrescrito nas subclasses
    public abstract float calculaSalario();
}
