import java.util.Scanner;

public class Exercise7 {
    Scanner keyboard;

    int[] createArray(int n) {
        if (n < 7 || n > 10) {
            System.out.println("Error");
        } else {
            int[] array = new int[n];
            keyboard = new Scanner(System.in);
            for (int i = 0; i < array.length; i++) {
                array[i] = keyboard.nextInt();
            }
            return array;
        }
        return null;
    }

    int countQuantityOfNumber(int n) {
        int quantities = 0;
        while (n > 0) {
            quantities++;
            n /= 10;
        }
        return quantities;
    }

    boolean checkExistOfNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return true;
            }
        }
        return false;
    }

    int sumSatisfiedCondition(int[] arr) {
        int result = 0;
        if (checkExistOfNegative(arr)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    result += arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (countQuantityOfNumber(arr[i]) == 3) {
                    result += arr[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        int[] array = exercise7.createArray(8);
        System.out.println(exercise7.sumSatisfiedCondition(array));
    }
}
