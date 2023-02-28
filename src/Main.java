import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        task01();
        task04();

    }

    private static void task04() {
        int[] arrayInt = new int[]{1,2,3};
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] = arrayInt[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }

    private static void task01() {
        int[] arrayInt = new int[]{1,2,3};
        showArraysValues(arrayInt);

        double[] arrayDouble = new double[]{1.57,7.654,9.986};
        showArraysValues(arrayDouble);
    }
    private static void showArraysValues(int array[]) {
        // Task number 2;
        String s = "";
        for (int row: array) {
            s += row + ", ";
        }
        s = s.substring(0, s.length() - 2);
        System.out.println(s);
    }
    private static void showArraysValues(double array[]) {
        // Task number 3;
        String s = "";
        for (int i = array.length - 1; i >= 0; i--) {
            s += array[i] + ", ";
        }
        s = s.substring(0, s.length() - 2);
        System.out.println(s);
    }
}