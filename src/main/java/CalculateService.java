public class CalculateService {
    public int calculateBonus(int allPurchase, int currentPurchase) {

        int blueStatusPurchase = 1;
        int silverStatusPurchase = 15000;
        int goldStatusPurchase = 150000;
        int blueStatusBonus = 50;
        int silverStatusBonus = 70;
        int goldStatusBonus = 100;
        int minPurchaseForGetBonus = 1000;

        if (currentPurchase < minPurchaseForGetBonus) {
            return 0;
        }
        if (allPurchase < silverStatusPurchase) {
            return ((currentPurchase / minPurchaseForGetBonus) * blueStatusBonus);
        }
        if (allPurchase < goldStatusPurchase) {
            return ((currentPurchase / minPurchaseForGetBonus) * silverStatusBonus);
        }
        else{
            return ((currentPurchase / minPurchaseForGetBonus) * goldStatusBonus);
        }
    }
}


