import java.util.List;

public class Practice {

    public static void intOperations() {
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - a = " + (a - a));
        System.out.println("b * a = " + (b * a));
        System.out.println("b / b = " + (b / b));
    }

    public static void intAndDoubleOperations() {
        int a = 10;
        double b = 20.1;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - a = " + (a - a));
        System.out.println("b * a = " + (b * a));
        System.out.println("b / b = " + (b / b));
    }

    public static void logicOperators() {
        int a = 5;
        int b = 10;

        System.out.println("a > 3 and b < 20: " + ((a > 3) && (b < 20)));
        System.out.println("a > 3 or b > 20: " + ((a > 3) || (b > 20)));
        System.out.println("not (a lower than 10): " + (!(a < 10)));
    }

    public static void overflowOperations() {
        System.out.println("maxInt + 1: " + (Integer.MAX_VALUE + 1));
    }



    public static void main(String[] args) {
        intOperations();
        intAndDoubleOperations();
        logicOperators();
        overflowOperations();
    }
}