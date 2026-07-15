package entities;

public class Product {

    public int     quantity;
    public double  price;
    public String  name;

    public double totalValueInStock() { return quantity * price; }

    public void   addProduct() { quantity += 1; }

    public void   removeProduct() {

        if(quantity != 0 ) quantity -= 1;
        else System.out.println("Sistema não pode remover um produto zerado");;
    }

}
