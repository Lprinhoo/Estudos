import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os Dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Product produto = new Product(name, price);

        while(true) {
            System.out.println("[1] Visualisar Dados [2]Adicionar Quantidade [3]Remover Quantidade [4]Sair");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println(produto.toString());
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Selecione quantos itens você quer adicionar: ");
                    int add = sc.nextInt();
                    produto.addProduct(add);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Selecione quantos itens você quer remover: ");
                    int menos = sc.nextInt();
                    produto.removeProduct(menos);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Até a próxima!");
                    System.exit(0);
                default:
                    System.out.println("Opção Invalida, por favor insira somente as opções abaixo");
                    System.out.println("");
                    break;
            }
        }
    }
}