package br.edu.fatec.franca.ex3;

public class TV extends Produto{
    private int canal;

    public TV(){
        super();
    }
    public TV(int serial, int volume, int canal){
        super(serial, volume);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public String toString(){
        return super.toString() + "\nCanal: " + canal + "\n";
    }
}
