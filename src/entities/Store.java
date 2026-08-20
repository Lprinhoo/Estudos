package entities;

import java.util.ArrayList;

public class Store {

    public ArrayList<Product> products = new ArrayList();

    public void createProduct(Product produto){products.add(produto);}

}
