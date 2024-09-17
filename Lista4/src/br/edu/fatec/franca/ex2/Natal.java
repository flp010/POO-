package br.edu.fatec.franca.ex2;

public class Natal extends CartaoWeb{

    public Natal(){

    }

    public Natal(String destinatario) {
        super(destinatario);
    }

    public void ShowMessage(){
        System.out.println("Feliz natal, " + getDestinatario());
    }
}
