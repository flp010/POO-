package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        //Opção 1

        Cliente obj1 = new Cliente();

        try {
            obj1.setNome("Carlos");
        }
        catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        try {
            obj1.setNroAgencia("1255-6");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            obj1.setNroConta("123456-8");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            obj1.setSaldo(0);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        obj1.depositar(1000f);
        obj1.sacar(300f);
        System.out.println(obj1);

        //Opção 2

        Cliente obj2 = new Cliente("123456-7", "1234-5", "Saulo", 0);
        obj2.depositar(1000f);
        obj2.sacar(5000f);
        System.out.println(obj2);


        if (obj1 == obj2) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
