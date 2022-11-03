public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println("1, " + expected + " == ? == " + actual);

        amount = 1000000;
        registered = true;
        expected = 500;
        actual = service.calculate(1000000, true);
        System.out.println("2, " + expected + " == ? == " + actual);

        amount = 10000;
        registered = false;
        expected = 100;
        actual = service.calculate(10000, false);
        System.out.println("3, " + expected + " == ? == " + actual);

        amount = 1000;
        registered = false;
        expected = 10;
        actual = service.calculate(1000, false);
        System.out.println("4, " + expected + " == ? == " + actual);

    }
}

