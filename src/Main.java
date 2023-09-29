import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj stopień danego wielomianu: ");
        Scanner scanner = new Scanner(System.in);
        int stopien = scanner.nextInt();

        System.out.println("Podaj wielomian: ");
        double[] arrayElements = new double[stopien + 1];
        for (int i = 0; i < arrayElements.length; i++) {
            System.out.println("Podaj wspolczynnik stopnia: " + (arrayElements.length - i - 1) + " ");
            arrayElements[i] = scanner.nextDouble();

        }

        System.out.println("Podaj pierwiastek: ");
        double root = scanner.nextDouble();
        boolean wynik = isRoot(root, arrayElements);
        if (wynik) System.out.println("Jest to pierwiastek");
        else System.out.println("Nie jest to pierwiastkiem");
    }


    public static boolean isRoot(double root, double[] arrayElements) {
        double result = 0;
        int sizeArray = arrayElements.length;
        for (int i = 0; i < sizeArray; i++) {
            result += arrayElements[i] * pow(root, sizeArray - i - 1);
        }
        if (result == 0) return true;
        else return false;
    }
}
