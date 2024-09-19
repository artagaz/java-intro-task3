package org.example;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.println(math(a,b,c));
    }

    public static List<Double> math(double a, double b, double c)
    {
        double D;
        List<Double> Answer = new java.util.ArrayList<>(List.of());

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            Answer.add(x1); Answer.add(x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            Answer.add(x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
            return null;
        }
        return Answer;
    }
}