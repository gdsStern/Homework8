import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] numberDouble = {1.57, 7.654, 9.986};
        int[] numberInt = new int[4];
        numberInt[0] = 5;
        numberInt[1] = 6;
        numberInt[2] = 7;
        numberInt[3] = 8;

        System.out.println("Задание 2");
        System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
        System.out.println(numberDouble[0] + ", " + numberDouble[1] + ", " + numberDouble[2]);
        for (int i = 0; i < numberInt.length; i++) {
            System.out.print(numberInt[i]);
            if (i != numberInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 3");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = numberDouble.length - 1; i >= 0; i--) {
            System.out.print(numberDouble[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = numberInt.length - 1; i >= 0; i--) {
            System.out.print(numberInt[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}