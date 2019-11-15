public class Main {
    public static void main(String[] args) {
        CalculateService service = new CalculateService();

        int result = service.calculateBonus(17000, 2200);

        System.out.println(result);
    }
}