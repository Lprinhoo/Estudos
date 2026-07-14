import java.util.Scanner;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);

    showAreaForTwoTriangle();

}

public static double calcularArea(double x, double y, double z) {

    double p = (x + y + z) / 2;
    double area = Math.sqrt(p * (p-x) * (p-y) * (p-z));

    return area;
}

public static void showAreaForTwoTriangle() {

    double xA, xB, xC, yA, yB, yC, areaX, areaY;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os valores do triangulo X");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();

    System.out.println("Digite os valores do triangulo Y");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    areaX = calcularArea(xA, xB, xC);
    areaY = calcularArea(yA, yB, yC);

    System.out.printf("Área do triangulo X: %.4f%n", areaX);
    System.out.printf("Área do triangulo Y: %.4f%n", areaY);

    if (areaX > areaY) System.out.println("A área maior pertence a área X");
    else if (areaX == areaY) System.out.println("Ambas as áreas são iguais");
    else System.out.println("A área maior pertence a área Y");

}

