package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int sumChetnuy = 0;
        for (int i = 0; i < 8; i++) {
            if (numbers[i] % 2 == 0) {
                sumChetnuy = sumChetnuy + numbers[i];


            }
        }
        System.out.println(sumChetnuy);
    }
}
