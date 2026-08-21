import java.util.Scanner;
import entities.User;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User(sc);

        boolean sair = false;
        while (!sair) {
            System.out.println();
            System.out.println("Bem vindo ao Banco do Nordeste");
            System.out.println("Qual operação deseja realizar:");
            System.out.println("[1] Ver Dados  [2] Sacar  [3] Depositar  [4] Sair");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Deseja realizar a alteração do nome?");
                    System.out.println("[1] Sim  [2] Não");
                    int y = sc.nextInt();
                    sc.nextLine();
                    if (y == 1) {
                        System.out.print("Digite seu novo nome: ");
                        String newName = sc.nextLine();
                        user.setName(newName);
                    } else if (y != 2) {
                        System.out.println("Opção inválida");
                    }
                    System.out.println(user);
                    break;

                case 2:
                    System.out.print("Digite o valor a ser sacado: R$");
                    double saque = sc.nextDouble();
                    user.sacar(saque);
                    System.out.println(user);
                    break;

                case 3:
                    System.out.print("Digite o valor a ser depositado: R$");
                    double deposito = sc.nextDouble();
                    user.deposito(deposito);
                    System.out.println(user);
                    break;

                case 4:
                    sair = true;
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}