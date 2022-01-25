package lesson4;

public class Main {
    public static void main(String[] args) {
        String email = "timati52@gmail.com";
        int dlina = email.length();
        System.out.println(dlina);

        String password = "dsffsBhgghhb";
        int dlinapass = password.length();
        System.out.println(dlinapass);

        if (dlinapass < 8) {
            System.out.println("password is too short");
            return;
        }
        //провери содержит ли пароль цифры (1 варинат)
        if (!password.contains("0") && !password.contains("1") && !password.contains("2") &&
                !password.contains("3") && !password.contains("4")) {
            System.out.println("в пароле нет цифры ");
            return;
        }
        //проверим содержит ли пароль цифры (2 варинат)
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int countNumInPass = 0;
        for (int i = 0; i < numbers.length; i++) {
            String currentNum = numbers[i];
            if (password.contains(currentNum)) {
                countNumInPass++;
            }
        }
        if (countNumInPass < 2) {
            System.out.println("цифр меньше чем 2 ");
            return;

        }
    }
}
