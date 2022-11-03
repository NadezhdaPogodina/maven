import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        long expected = 30;
        long actual = service.calculate(1000, true);
        //System.out.println(expected + " == ? == " + actual);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testRegisteredOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000000;
        long expected = 500;
        long actual = service.calculate(1000000, true);

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void testUnregisteredOverLimit() {
        BonusService service = new BonusService();
        long amount = 10000;
        long expected = 100;
        long actual = service.calculate(10000, false);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        long expected = 10;
        long actual = service.calculate(1000, false);

        assertEquals(expected, actual);
    }
}


