package br.edu.fatec.franca.ex2;

public class DiadosNamorados extends CartaoWeb{

    public DiadosNamorados() {

    }

    public DiadosNamorados(String destinatario) {
        super(destinatario);
    }

    public void ShowMessage() {
        System.out.println("Feliz dia dos namorados, " + getDestinatario());
    }

}

