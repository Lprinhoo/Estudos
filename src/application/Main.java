import java.util.Scanner;

import entities.User;
import entities.Bank;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //chama cadastro de usuario
        User user = User.cadastrarConta(sc);

        //inicia sistema do banco
        Bank.mainMenu(user, sc);
    }
}

