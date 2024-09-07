package br.edu.fatecfranca.ex0;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Monitor", 600f);
        Product prod2 = new Product(2, "Teclado", 140f);
        Product prod3 = new Product(3, "Mouse", 90f);
        //CarItem car1 = new CarItem (1, 5, prod1);
        //CarItem car2 = new CarItem(2,6, prod1);
        //CarItem car3 = new CarItem(3,10, prod2);
        //CarItem car4 = new CarItem(4,15, prod2);
        //CarItem car5 = new CarItem(5,20, prod3);
        ShoppingCart sh1 = new ShoppingCart(1, "Franca", "Cartão de credito");
        sh1.addCarItem(1, 5, prod1);
        sh1.addCarItem(3, 10, prod2);
        sh1.calculatePrice();
        System.out.println(sh1.toString());

        ShoppingCart sh2 = new ShoppingCart(2, "Batatais", "Pix");
        sh2.addCarItem(2, 6, prod1);
        sh2.addCarItem(5, 20, prod3);
        sh2.calculatePrice();
        System.out.println(sh2.toString());

    }
}