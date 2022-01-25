package lesson3;

public class Main5 {
    public static void main(String[] args) {
        //наполнить этот массив четными числами от 2 ...
        int[] numbers = new int[5];
//        numbers[0] = 2;
//        numbers[1] = 4;
//        numbers[2] = 6;
//        numbers[3] = 8;
//        numbers[4] = 10;

        int value = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value = value + 2;
            System.out.println(numbers[i]);

        }

    }
}
