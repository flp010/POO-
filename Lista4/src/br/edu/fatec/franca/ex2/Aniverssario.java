package br.edu.fatec.franca.ex2;

public class Aniverssario extends CartaoWeb {

    public Aniverssario(String destinatario) {
        super(destinatario);
    }

    public void ShowMessage(){
        System.out.println("Feliz aniverssario, " + getDestinatario());
    }

}
