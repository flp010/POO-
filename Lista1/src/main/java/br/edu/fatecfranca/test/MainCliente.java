package br.edu.fatecfranca.test;

import br.edu.fatecfranca.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente(123, 456, "José", 0);
        System.out.println(cli1.toString());
        cli1.depositar(1000);
        System.out.println(cli1.toString());
        cli1.sacar(300);
        System.out.println(cli1.toString());
    }
}
