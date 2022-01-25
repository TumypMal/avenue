package lesson6;

public class StringUtils {

    /**
     * 1- модификатор доступа при создании метода (одно из 4х видов слов , которое регулирет область видимости данного метода
     * public -метод доступен внутри всего проекта
     * protected - доступен внутри пакета и класса наследника
     * private - доступ внутри текущего класса
     * _______ - доступен внутри текущего пакета
     * 2 - static (или пишем или нет )
     * 3- возвращаемый тип (int String Date .... ) или указывается void если ничего не возвращается
     * 4- название метода
     * 5- входящие параметры (String text,int count....)
     * 6 - тело метода , то что будет происходить при вызове данного метода
     */


    public static int countGlassFromText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)
                    == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'y' || text.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }

    public static void printTextByWords(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("!", "");
        text = text.replace(":", "");
        text = text.replace("-", "");
        text = text.replace("?", "");
        text = text.replace(";", "");

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void coding(String textByCoding) {
        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        String alphabetUpper = alphabet.toUpperCase();
        String result = "";
        for (int i = 0; i < textByCoding.length(); i++) {
            int indexOf = alphabet.indexOf(textByCoding.charAt(i));
            int indexOfUpper = alphabetUpper.indexOf(textByCoding.charAt(i));
            if (indexOf >= 0) {
                result = result + alphabet.charAt(indexOf + 1);
            } else if (indexOfUpper >= 0) {
                result = result + alphabetUpper.charAt(indexOfUpper+1);
            } else {
                result = result + textByCoding.charAt(i);
            }

        }
        System.out.println(result);
    }


}
