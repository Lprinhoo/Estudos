import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle x, y;

    x = new Triangle();
    y = new Triangle();

    System.out.println("Digite os valores do Triangulo X");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Digite os valores do Triangulo Y");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    System.out.printf("Área do triangulo X: %.4f%n", x.calcularArea());
    System.out.printf("Área do triangulo Y: %.4f%n", y.calcularArea());
}
