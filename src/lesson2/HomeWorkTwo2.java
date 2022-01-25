package lesson2;

public class HomeWorkTwo2 {
    public static void main(String[] args) {
        //Вывести на консоль числа от 10 до 50 , при этом не выводить от 20 до 25
        for (int i = 10; i <= 50; i++) {
            if (i < 20 || i > 25) {
                System.out.println(i);
            }
        }
    }
}
