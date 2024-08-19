package br.edu.fatecfranca;

public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){

    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo += x;
        System.out.println("Depósito realizado com sucesso");
    }
    public void sacar(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saque não realizado, saldo insuficiente");
        }
    }
    public String toString(){
        return "Numero da conta: " + this.numeroConta + " Nome: " + this.nome + "\nSaldo atual: " + this.saldo;
    }


}

