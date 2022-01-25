package lesson2;

public class Prog {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 6;

        if (a == b && b == c && c == a) {
            System.out.println("Это раВносторонний треугольник");

        }
        if (a != b && b != a && c != a) {
            System.out.println(" Это раЗносторонний треугольник");

        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
