package br.edu.fatecfranca;

public class Produto {
    int id;
    String descricao;
    int qtde;
    float preco;

    public Produto(){

    }
    public Produto(int id, String descricao, int qtde, float preco){
    this.id = id;
    this.descricao = descricao;
    this.qtde = qtde;
    this.preco = preco;
    }
    public void comprar(int x){
        this.qtde = this.qtde + x;
        System.out.println("comprado " + x + " Produtos o estoque agora e´: " + this.qtde);
    }
    public void vender(int x){
        if(this.qtde < x){
            System.out.println("É possivel vender apenas: " + this.qtde);
        }
        else if (this.qtde >= x){
            this.qtde = this.qtde - x;
            System.out.println("Venda de " + x +" Realizada com sucesso, o estoque é: " + this.qtde);
        }
    }
    public void subir(float x){
        System.out.println("O preço era: " + this.preco);
        this.preco = this.preco + x;
        System.out.println("O preço após o aumento de " + x + " é: " + this.preco);
    }
    public void descer(float x) {
        if (x >= this.preco) {
            System.out.println("O preço não pode ser 0");
        }else if(x < this.preco) {
            this.preco = this.preco - x;
            System.out.println("O preço após abaixar " + x + " é: " + this.preco);
        }
    }
    public String toString(){
        return ("ID: " + this.id + "\nDescrição: " + descricao + "\nQuantidade: " + qtde + "\nPreço: " + preco);
    }


}