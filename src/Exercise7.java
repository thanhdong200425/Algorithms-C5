import java.util.Scanner;

public class Exercise7 {

    private final int ARRAY_MIN_LENGTH = 7;
    private final int ARRAY_MAX_LENGTH = 10;
    private final int MIN_POSITIVE_VALUE = 0;
    private final int MAX_THREE_DIGIT_NUMBER = 999;
    private final int MIN_THREE_DIGIT_NUMBER = 100;

    int[] createArray(int n) {
        if (n <= ARRAY_MIN_LENGTH || n >= ARRAY_MAX_LENGTH) {
            System.out.println("Error");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = Exercise4.getRandomNumber();
            }
            return array;
        }
        return null;
    }

    boolean isHasNegativeNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return true;
            }
        }
        return false;
    }

    int sumNegativeNumbers(int[] arr) {
        int result = 0;
        for (int num : arr) {
            if (num < MIN_POSITIVE_VALUE) {
                result += num;
            }
        }
        return result;
    }

    int sumOfThreeDigitNumbers(int[] arr) {
        int result = 0;
        for (int num : arr) {
            if (num >= MIN_THREE_DIGIT_NUMBER && num <= MAX_THREE_DIGIT_NUMBER) {
                result += num;
            }
        }
        return result;
    }

    // int countQuantityOfNumber(int n) {
    // int quantities = 0;
    // while (n >= 1) {
    // quantities++;
    // n /= 10;
    // }
    // return quantities;
    // }

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        int[] array = exercise7.createArray(8);

        if (array != null) {
            if (exercise7.isHasNegativeNumber(array)) {
                System.out.println(exercise7.sumNegativeNumbers(array));
            } else {
                System.out.println(exercise7.sumOfThreeDigitNumbers(array));
            }
        }
    }
}
