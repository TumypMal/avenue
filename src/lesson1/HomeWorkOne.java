package lesson1;

public class HomeWorkOne {
    public static void main(String[] args) {
        int Money = 1000;
        int Pizza = 230;
        int Gum = 26;
        double Sweets = 2.5;

        int AmountPizza = Money / Pizza;//покупка пиццы
        int Change = Money % Pizza;//сдача с пиццы
        int AmountGum = Change / Gum;//покупка жвачки
        int ChangeAfterPizzaAndGum = Change % Gum;//cдача после покупки жвачки
        int AmountSweets = (int) (ChangeAfterPizzaAndGum / Sweets);//покупка конфет

        System.out.println("На эти деньги мы можем купить:");
        System.out.print("Пиццы-");
        System.out.println(AmountPizza);
        System.out.print("Жвачки-");
        System.out.println(AmountGum);
        System.out.print("Конфеты-");
        System.out.println(AmountSweets);
        System.out.print("Сдача с магазина-");
        System.out.println(ChangeAfterPizzaAndGum);

    }
}
