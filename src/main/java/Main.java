import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int AllPurchase = 0;
        int CurrentPurchase = 0;
        int StandartLevel = 1;
        int SilverLevel = 15000;
        int GoldLevel = 150000;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму покупок: ");
        AllPurchase = in.nextInt();
        System.out.println("Введите сумму покупки: ");
        CurrentPurchase = in.nextInt();
        if (AllPurchase <= SilverLevel) {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*50);
        }
        else if (AllPurchase <= GoldLevel) {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*70);
        }
        else {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*100);
        }
    }
}
