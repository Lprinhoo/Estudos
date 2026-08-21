package entities;

import java.util.Scanner;

public class User {

    private int id;
    private String name;
    private double value;

    public User(Scanner sc) {
        System.out.println("Vamos cadastrar sua conta!");

        System.out.print("Número da conta: ");
        this.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do titular: ");
        this.name = sc.nextLine();

        boolean definido = false;
        while (!definido) {
            System.out.println("Deseja depositar um valor inicial?");
            System.out.println("[1] Sim  [2] Não");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Entre com o valor a ser depositado\nR$");
                    this.value = sc.nextDouble();
                    definido = true;
                    break;
                case 2:
                    this.value = 0.0;
                    definido = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
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

    public String toString() {
        return "Número da conta: " + id
                + "\nTitular: "    + name
                + "\nSaldo: R$"    + String.format("%.2f", value);
    }

    public void deposito(double value) {
        this.value += value;
    }

    public void sacar(double value) {
        double taxa = 5.00;
        this.value -= value + taxa;
    }
}