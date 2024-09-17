package br.edu.fatec.franca.ex3;

public class Produto {
    protected int serial;
    protected int volume;
    protected String teste;

    public Produto() {
        this.serial = 0;
        this.volume = 0;
        this.teste = "Não testado";
    }

    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "não testado";
    }

    public void testaUnidade(){
        if (this.teste.equals("não testado")){
            int random = (int) (Math.random() * 10); // gera número de 0 a 9
            if (random == 0){ // 10%
                this.teste = "reprovado";
            }
            else{
                this.teste = "aprovado";
            }
        }
        else{ // 90%
            System.out.println("Unidade ja testada");
        }
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}

