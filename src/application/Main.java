import java.util.Scanner;
import java.util.Locale;
import entities.Product;
import entities.Store;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Store store = new Store();
        store.createProduct(new Product(sc));

    }
}