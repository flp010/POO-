package br.edu.fatec.franca;

public class Assistente extends Funcionario {  //   Assistente extends (herda) Funcionario
    private float horaExtra;

    public Assistente() {
        super(); // Chama construtor sem parametdo da superclasse
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return  "\nCargo: Assintente: " +
                "\nhoraExtra: " + horaExtra +
                super.toString();
    }
    @Override
    public float calculaSalario() {
        return this.salario + this.horaExtra *40.0f;
    }
}


