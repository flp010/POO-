package br.edu.fatecfranca;

public class Carro {
    //DECLARANDO AS VARIAVEIS
    public String marca, modelo, cor;

    public int ano;
    public float velaAtual;

    //CRIANDO O METODO CONSTRUCTOR E DECLARANDO OS PARÂMETROS DO MÉTODO
    public Carro(){
        this.modelo = "Não definido"; this.marca = "Não definido";
        this.velaAtual = 0;

    }
    public Carro (String marca, String modelo, String cor, int ano, float velAtual) {
        //ATRIBUINDO OS VALORES PASSADOS NO PARÂMETRO PARA O OBJETO QUE CHAMA O CONSTRUTOR
        // THIS REPRESENTA O OBJETO QUE CHAMA O CONSTRUTOR
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velaAtual = velAtual;
    }
    //MÉTODO VAI ACELERAR
    public void acelerar(float x){
        this.velaAtual = this.velaAtual + x;
        System.out.println("Objeto acelerando... " + this.marca + " " +  this.modelo + " " +this.velaAtual);
    }
    public void frear(float x) {
        if (this.velaAtual >= x) {
            this.velaAtual = this.velaAtual - x;
            System.out.println("Objeto freando..." + this.marca + " " + this.modelo + " " + this.velaAtual);
        }
        else{
            System.out.println("Objeto não pode ter velocidade negativa");
        }

    }
    //CONVERTE OBJETO PARA STRING
    public String toString(){
        return "Marca: " + this.marca + " " + "Modelo: " + this.modelo + " " + "Cor: " + this.cor + " " + "Ano: " + this.ano + " " + "Velocidade: " + this.velaAtual;
    }
}
