package entities;

public class Product {

    public int     quantity;
    public double  price;
    public String  name;

    public double totalValueInStock() { return quantity * price; }

    public void   addProduct(int quantity) { this.quantity += quantity; }

    public void   removeProduct(int quantity) {
        if(this.quantity != 0 ) quantity -= quantity;
        else System.out.println("Sistema não pode remover um produto zerado");;
    }

    public String toString() {
        return "Dados Atualizados: "+ name + ", R$" + String.format("%.2f", price)
                + ", "  + quantity + " Unidades, Total: R$" + String.format("%.2f", totalValueInStock());
    }
}
