package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    private int id;
    private String name;
    private double value;

    public User(String name, double value) {
        this.name = name;
        this.value = value;
        this.id = idCreate();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Número da conta: " + id
                + "\nTitular: "    + name
                + "\nSaldo: R$"    + String.format("%.2f", value);
    }

    public static User cadastrarConta(Scanner sc) {

        System.out.println("Vamos cadastrar sua conta!");
        System.out.print("Nome do Titular: ");
        String name = sc.nextLine();

        double value = 0.0;
        boolean sair = false;

        while(!sair) {
            System.out.println("Deseja depositar um valor inicial?");
            System.out.println("[1]Sim [2]Não");
            int x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1:
                    System.out.print("Entre com o valor a ser depositado\nR$");
                    value = sc.nextDouble();
                    sc.nextLine();
                    sair = true;
                    break;
                case 2:
                    value = 0.0;
                    sair = true;
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }

        User user = new User(name, value);
        Bank.users.add(user);

        return user;
    }

    public int idCreate() {

        int id = (int) (Math.random() * 90000) + 10000;

        for (int i = 0; id == Bank.idList.get(i); i++) {
            id = (int) (Math.random() * 90000) + 10000;
        }

        return id;

    }

    public void deposito(double value) {
        this.value += value;
    }

    public void sacar(double value) {
        double taxa = 5.00;

        if(this.value >= value + taxa) {
            this.value -= value + taxa;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}