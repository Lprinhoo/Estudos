import java.util.Scanner;

import entities.Bank;
import entities.SystemBank;
import entities.User;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = User.cadastrarConta(sc);

        SystemBank.mainMenu(user, sc);
    }
}