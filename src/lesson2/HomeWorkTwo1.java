package lesson2;

public class HomeWorkTwo1 {
    public static void main(String[] args) {
        //Вывести на консоль сумму четных чисел от 20 до 40
        int x;
        int total = 0;

        for (x = 20; x <= 40; x++) {
            if (x % 2 == 0) {

            }
            total = total + x;
        }
        System.out.println(total);


    }
}