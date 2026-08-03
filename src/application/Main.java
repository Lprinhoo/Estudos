import java.util.Scanner;
import entities.Product;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int quantity;
    Product produto = new Product();

    System.out.println("Entre com os Dados do produto: ");
    System.out.print("Nome: ");
    produto.name = sc.nextLine();

    System.out.print("Preço: ");
    produto.price = sc.nextDouble();

    System.out.print("Quantidade: ");
    produto.quantity = sc.nextInt();
    System.out.println("Produto Criado! qual o proximo passo ?");

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
                quantity = sc.nextInt();
                produto.addProduct(quantity);
                System.out.println("");
                break;
            case 3:
                System.out.print("Selecione quantos itens você quer remover: ");
                quantity = sc.nextInt();
                produto.removeProduct(quantity);
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