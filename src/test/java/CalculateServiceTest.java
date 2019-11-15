import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceTest {

        @Test
        void noBonusPurchase(){

            CalculateService service = new CalculateService();

            int result = service.calculateBonus(17200, 450);

            assertEquals(0, result);
        }

        @Test
        void blueStatus(){
            CalculateService service = new CalculateService();

            int result = service.calculateBonus(7200, 1400);

            assertEquals(50, result);

        }

        @Test
        void silverStatus(){
            CalculateService service = new CalculateService();

            int result = service.calculateBonus(17000, 2200);

            assertEquals(140, result);
        }

        @Test
        void goldStatus(){
            CalculateService service = new CalculateService();

            int result = service.calculateBonus(172000, 14300);

            assertEquals(1400, result);
        }
}

