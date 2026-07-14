import java.util.Scanner;
import java.util.Locale;

void main() {

    double xA, xB, xC, yA, yB, yC;

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os valores do triangulo X");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();

    System.out.println("Digite os valores do triangulo Y");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    System.out.printf("Aréa do triangulo X: %.4f%", calcularArea(xA, xB, xC));
    System.out.printf("Aréa do triangulo Y: %.4f%", calcularArea(yA, yB, yC));

}

public static double calcularArea(double x, double y, double z) {

    double p = (x + y + z) / 2;
    double area = Math.sqrt(p * (p-x) * (p-y) * (p-z));

    return area;
}

