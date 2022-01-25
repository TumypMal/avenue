package lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //какую фигуру вы хотите посчитать ?
        System.out.println("Выберите фигуру");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - треугольник");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - трапеция");
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) {
            System.out.println("введите радиус круга: ");
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);
            System.out.println("площадь или окружность?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга " + (Math.PI * (radius * radius)));
            } else {
                System.out.println("Окружность круга " + (2 * Math.PI * radius));
            }
        } else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {
            System.out.println("площадь или периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Введите длинну большей полуоси: ");
                String aStr = scanner.nextLine();
                double a = Double.parseDouble(aStr);
                System.out.println("Введите длинну меньшей полуоси: ");
                String bStr = scanner.nextLine();
                double b = Double.parseDouble(bStr);
                System.out.println("Площадь овала  равна: " + (Math.PI * a * b));
            } else {
                System.out.println("Введите длинну большей полуоси: ");
                String aStr = scanner.nextLine();
                double a = Double.parseDouble(aStr);
                System.out.println("Введите длинну меньшей полуоси: ");
                String bStr = scanner.nextLine();
                double b = Double.parseDouble(bStr);
                System.out.println("Периметр овала  равен: " + 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
            }
        } else if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {
            System.out.println("Площадь или периметр ?: ");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Введите ширину треугольника: ");
                String baseStr = scanner.nextLine();
                double base = Double.parseDouble(baseStr);
                System.out.println("Введите высоту треугольника: ");
                String heightStr = scanner.nextLine();
                double height = Double.parseDouble(heightStr);
                System.out.println("Площадь треугольника равна: " + ((base * height) / 2));
            } else {
                System.out.println("Введите a треугольника: ");
                String aStr = scanner.nextLine();
                double a = Double.parseDouble(aStr);
                System.out.println("Введите b треугольника: ");
                String bStr = scanner.nextLine();
                double b = Double.parseDouble(bStr);
                System.out.println("Введите c треугольника: ");
                String cStr = scanner.nextLine();
                double c = Double.parseDouble(cStr);
                System.out.println("Периметр треугольника равен: " + (a + b + c));
            }
        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Введите ширину прямоугольника: ");
            String baseStr = scanner.nextLine();
            double base = Double.parseDouble(baseStr);
            System.out.println("Введите высоту прямоугольника: ");
            String heightStr = scanner.nextLine();
            double height = Double.parseDouble(heightStr);
            System.out.println("площадь или периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь прямоугольника равна: " + (base * height));
            } else {
                System.out.println("Периметр прямоугольника равен " + (2 * (base + height)));
            }
        } else if (figura.equals("5") || figura.equalsIgnoreCase("трапеция")) {
            System.out.println("Площадь или периметр ?: ");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Введите среднюю линию трапеции: ");
                String middleStr = scanner.nextLine();
                double middle = Double.parseDouble(middleStr);
                System.out.println("Введите высоту трапеции: ");
                String heightStr = scanner.nextLine();
                double height = Double.parseDouble(heightStr);
                System.out.println("Площадь трапеции равна: " + (height * middle));
            } else {
                System.out.println("Введите a трапеции: ");
                String aStr = scanner.nextLine();
                double a = Double.parseDouble(aStr);
                System.out.println("Введите b трапеции: ");
                String bStr = scanner.nextLine();
                double b = Double.parseDouble(bStr);
                System.out.println("Введите c трапеции: ");
                String cStr = scanner.nextLine();
                double c = Double.parseDouble(cStr);
                System.out.println("Введите d трапеции: ");
                String dStr = scanner.nextLine();
                double d = Double.parseDouble(dStr);
                System.out.println("Периметр трапеции равен: " + (a + b + c + d));
            }
        } else {
        }
    }
}
