package lesson2;

public class Prog1 {
    public static void main(String[] args) {
        int mark = 5;

        switch(mark){
            case 5:
                System.out.println("Exellent");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Sat");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("its not a mark");
        }
    }
}
