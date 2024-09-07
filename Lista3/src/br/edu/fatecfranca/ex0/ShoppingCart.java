package br.edu.fatecfranca.ex0;
import java.util.ArrayList;
import java.util.List;

//  É objeto todo para a associaçao com CarItem
public class ShoppingCart {
    private int id;
    private double price;
    private String endereco;
    private String formaPagto;
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.formaPagto = "";  // deve retornar vazio ("")
        this.endereco = "";
        //  Alocar espaço na memória para o vetor
        carItens = new ArrayList<CarItem>();

    }
    public ShoppingCart(int id, String endereco, String formaPagto) {
        this.id = id;
        this.price = 0;
        this.endereco = endereco;
        this.formaPagto = formaPagto;
        //  Alocar espaço na memória pra o vetor
        carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", price=" + price +
                ", endereco='" + endereco + '\'' +
                ", formaPagto='" + formaPagto + '\'' +
                ", carItens=" + carItens +
                '}';
    }
    // Metodo para adicionar um item de carrinho no carrinho de compra
    // este metodo envolve conceito de composição ou seja, item de carrinho
    // precisa ser criado dentro do método

    public void addCarItem(int id, int quantity, Product product){
        carItens.add(new CarItem(id, quantity, product));

    }
    //  Calcula valor toral do carrinho
    public void calculatePrice(){
        double total = 0;
        //  Para cada item do carrinho
        for(CarItem item : carItens){
            total += item.getQuantity() * item.getProduct().getPrice();
        }
        this.price = total;
    }
}
