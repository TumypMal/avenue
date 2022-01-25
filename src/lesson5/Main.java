package lesson5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //таймер на 10 лет ))))
        for (int year = 0; year < 10; year++) {
            for (int day = 0; day < 365; day++) {
                for (int hour = 0; hour < 24; hour++)
                    for (int minute = 0; minute < 60; minute++) {
                        for (int second = 0; second < 60; second++) {
                            System.out.printf("Со старта прошло %d года %d дня %d часа %d минут %d секунд \n ", year, day, hour, minute, second);
                            Thread.sleep(1000);

                        }
                    }
            }

        }
    }
}
