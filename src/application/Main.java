import java.util.Scanner;

import entities.User;
import entities.Bank;
import entities.SystemBank;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = User.cadastrarConta(sc);

        System.out.println(Bank.getUsersID());

        SystemBank.mainMenu(user, sc);
    }
}