package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //Турагенство
        String[][] tours = {{"турция", "5 дней", "самолет", "5 звезд", "120000"},
                {"турция", "7 дней", "автобус", "4 звезд", "100000"},
                {"греция", "6 дней", "самолет", "3 звезд", "90000"},
                {"турция", "12 дней", "автобус", "4 звезд", "80000"},
                {"турция", "6 дней", "самолет", "5 звезд", "150000"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");

        String country = scanner.nextLine();

        System.out.println("У нас есть эти туры в " + country);

        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                System.out.println(tours[i][0] + ", на" + tours[i][1] +  tours[i][2] +  tours[i][3] + ",цена- " + tours[i][4]);

            }

        }
        System.out.println("Сколько максимум дней для поездки?");
        String dayStr = scanner.nextLine();

        int day =Integer.parseInt(dayStr);
        for(int i = 0; i< tours.length;i++) {
            int dayFromTour = Integer.parseInt(tours[i][1].replaceAll("[\\D]", ""));
            if(dayFromTour<= day ){
                System.out.println(tours[i][0] + ", на" + tours[i][1] +  tours[i][2] +  tours[i][3] + ",цена- " + tours[i][4]);
                //вывести все туры от до , в
                //средняя цена любого тура в агенстве
                //туры от скольки звезды
            }
        }
    }
}
