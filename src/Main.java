import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final int LENGTH = 5;
    public static final int WIDTH = 5;

    public static void main(String[] args) {

        System.out.println("Task 2");
        System.out.println(daysInMonthCounter(MonthOfYear.FEBRUARY));
        System.out.println("Task 3");
        System.out.println(findDifferenceBetweenMaxAndMin(generateArray(LENGTH)));
        System.out.println("Task 4");
        System.out.println(isEqualArrays(generateArray(LENGTH), generateArray(LENGTH)));
        System.out.println("Task 5");
        System.out.println(missingNumberInArray());
        System.out.println("Task 6");
        System.out.println(minElementInTwoDimensionalArray(generateTwoDimensionalArray(LENGTH, WIDTH)));
        System.out.println("Task 7");
        printTwoDimensionalArray(swapMinAndMaxInTwoDimensionalArray(generateTwoDimensionalArray(LENGTH, WIDTH)));
        System.out.println("Task 8");
        printTwoDimensionalArray(swapOddElementInTwoDimensionalArray(generateTwoDimensionalArray(LENGTH, WIDTH)));
    }

    public static int daysInMonthCounter(MonthOfYear month) {
        int days = 0;
        switch (month) {
            case JANUARY:
                days = 31;
                break;
            case FEBRUARY:
                days = 28;
                break;
            case MARCH:
                days = 30;
                break;
            case APRIL:
                days = 30;
                break;
            case MAY:
                days = 31;
                break;
            case JUNE:
                days = 30;
                break;
            case JULY:
                days = 31;
                break;
            case AUGUST:
                days = 31;
                break;
            case SEPTEMBER:
                days = 30;
                break;
            case OCTOBER:
                days = 31;
                break;
            case NOVEMBER:
                days = 30;
                break;
            case DECEMBER:
                days = 31;
                break;
            default:
        }
        return days;
    }

    public static int[] generateArray(int LENGTH) {
        int[] array = new int[LENGTH];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(25);
        }
        return array;
    }

    public static int[][] generateTwoDimensionalArray(int LENGTH, int WIDTH) {
        int[][] array = new int[LENGTH][WIDTH];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10);
            }
        }
        return array;
    }

    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int findDifferenceBetweenMaxAndMin(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max - min;
    }

    public static boolean isEqualArrays(int[] array, int[] array2) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int missingNumberInArray() {
        int[] unsortedArray = {2, 3, 1, 0, 9, 4, 6, 5, 8,};
        int sum = 0;
        int missingElement = 0;
        for (int i = 0; i < unsortedArray.length; i++) {
            sum += unsortedArray[i];
            int correctArraySum = 45;
            missingElement = correctArraySum - sum;
            if (sum == correctArraySum) {
                missingElement = -1;
            }
        }
        return missingElement;
    }

    public static int minElementInTwoDimensionalArray(int[][] array) {
        int minElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                }
            }
        }
        return minElement;
    }

    public static int[][] swapMinAndMaxInTwoDimensionalArray(int[][] array) {
        int maxElement = array[0][0];
        int minElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                }
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        return array;
    }

    public static int[][] swapOddElementInTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int tmp = array[i][j];
                if ((array[i][0]) % 2 != 0) {
                    tmp = 0;
                }
                if (j % 2 != 0) {
                    tmp = array[i][j - 1];
                }
            }
        }
        return array;
    }
}