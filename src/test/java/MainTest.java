import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        int AllPurchase = 0;
        int CurrentPurchase = 0;
        int StandartLevel = 1;
        int SilverLevel = 15000;
        int GoldLevel = 150000;

        AllPurchase = 4000;
        CurrentPurchase = 2750;
        if (AllPurchase <= SilverLevel) {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*50);
        }
        else if (AllPurchase <= GoldLevel) {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*70);
        }
        else {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*100);
        }


        AllPurchase = 100_000;
        CurrentPurchase = 10845;
        if (AllPurchase <= SilverLevel) {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*50);
        }
        else if (AllPurchase <= GoldLevel) {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*70);
        }
        else {
            System.out.println("Количество бонусов " + (Math.floor(CurrentPurchase/1000))*100);
        }
        AllPurchase = 180_000;
        CurrentPurchase = 900;
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