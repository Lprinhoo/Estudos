import java.util.Scanner;
import entities.Product;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product produto = new Product();

    System.out.println("Entre com os Dados do produto: ");
    System.out.print("Nome: ");
    produto.name = sc.nextLine();

    System.out.print("Preço: ");
    produto.price = sc.nextDouble();

    System.out.print("Quantidade: ");
    produto.quantity = sc.nextInt();

    System.out.println(produto.toString());

    System.out.print("Selecione quantos itens você quer remover: ");
    int x = sc.nextInt();

    produto.quantity -= x;

    System.out.println(produto.toString());

}