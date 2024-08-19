package br.edu.fatecfranca;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {

    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome  = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        this.nivel = this.nivel + x;
        System.out.println("Choveu e o nivel do rio " + this.nome + " subiu para: " + this.nivel);
    }

    public void ensolarar(float x) {
        this.nivel = this.nivel - x;
        if (this.nivel < 0) {
            this.nivel = 0;
            System.out.println("O sol fez o nivel do rio " + this.nome + " baixar para: " + this.nivel);
        }
    }
    public void sujar(){
        if (this.poluido){
            System.out.println("O rio " + this.nome + " ja esta poluido");
        }else{
            this.poluido = true;
            System.out.println("O rio " + this.nome + " foi poluido e esta cheio de bosta");
        }
    }
    public void limpar(){
        if (this.poluido){
            this.poluido = false;
            System.out.println("O rio " + this.nome + " foi limpo");
        }else System.out.println("O rio " + this.nome + " já esta limpo");

    }
    public String toString(){
        return ("\n" + "O rio " + this.nome + " Esta no nivel " + this.nivel + " E seu estado de poluição é " + this.poluido + "\n");
    }
}

