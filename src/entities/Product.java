package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Product{

    public int     quantity;
    public double  price;
    public String  name;

    public Product() {}

    public Product(Scanner sc) {

        System.out.println("Entre com os Dados do produto");
        System.out.print("Nome: ");
        this.name = sc.nextLine();

        System.out.print("Preço: ");
        this.price = sc.nextDouble();
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() { return quantity * price; }

    public void addProduct(int quantity) { this.quantity += quantity; }

    public void removeProduct(int quantity) {
        if(this.quantity != 0 ) this.quantity -= quantity;
        else System.out.println("Sistema não pode remover um produto zerado");;
    }


    public String toString() {
        return name + ", R$" + String.format("%.2f", price)
                + ", "  + quantity + " Unidades, Total: R$" + String.format("%.2f", totalValueInStock());
    }
}
