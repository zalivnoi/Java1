package Homework2;

public class Homework2 {
    public static void main(String[] args) {
        summInPredel();
        checkNumber();
        checkNumber2();
        risuemStroku();
    }
    public static void summInPredel() {
        int a = 25;
        int b = 8;
        boolean c = true;
        if ((a + b) > 10 && (a + b) < 20) {
            System.out.println(c);
        }
        else {
            c = false;
            System.out.println(c);
        }

    }
    public static void checkNumber() {
        int d = -2;
        if (d >= 0) {
            System.out.println("Число положительное");
        }
        else
            System.out.println("Число отрицательное");
    }
    public static void checkNumber2() {
        int e = -5;
        if (e < 0) {
            boolean number = true;
            System.out.println(number);
        }
        else {
            boolean number = false;
            System.out.println(number);
        }
    }
    public static void risuemStroku() {
        int i = 5;
        String text = "Hello World!";
        for (int k = 0; k < i; k++) {
            System.out.println(text);
        }
    }
}
