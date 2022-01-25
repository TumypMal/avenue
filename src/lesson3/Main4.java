package lesson3;

public class Main4 {
    public static void main(String[] args) {
        //вывести на консоль только гласные буквы
        char[] symbols = {'a', 'v', 's', 'r', 'e', 'h', 'k'};
        for (int i = 0; i < symbols.length;i++ ) {
            if(symbols[i]=='a'||symbols[i]=='o'||symbols[i]=='e'||symbols[i]=='y'||symbols[i]=='i'){
                System.out.println(symbols[i]);
            }


        }
    }
}
