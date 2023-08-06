import java.util.Random;

public class Exercise8 {

    int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    int[] createArray(int quantity) {
        if (quantity > 30 || quantity < 15) {
            System.out.println("Out of range!");
        } else {
            int[] array = new int[quantity];
            for (int i = 0; i < array.length; i++) {
                array[i] = createRandomNumber();
            }
            return array;
        }
        return null;
    }

    boolean checkPerfectSquareNumber(int n) {
        if (n > 0) {
            for (int i = 1; i <= n / 2; i++) {
                if (Math.pow(i, 2) == n) {
                    return true;
                }
            }
        } else if (n == 1) {
            return true;
        }
        return false;
    }

    int[] sortAscending(int[] arr) {
        int length = arr.length;
        for (int element = 0; element < length - 1; element++) {
            int minIndex = element; // Track the index of the minimum element
            for (int minimum = element + 1; minimum < length; minimum++) {
                if (arr[minimum] < arr[minIndex]) {
                    minIndex = minimum; // Update the index of the minimum element
                }
            }
            // Swap the elements after both loops
            int temp = arr[element];
            arr[element] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    int sumOfPerfecSquareNumber(int[] arr) {
        int count = 0;
        int result = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (checkPerfectSquareNumber(arr[i])) {
                result += arr[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There haven't a perfect square number");
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise8 e = new Exercise8();
        int[] newArr = e.createArray(15);
        int[] sortedArr = e.sortAscending(newArr);
        Exercise3.print(sortedArr);
        System.out.println(e.sumOfPerfecSquareNumber(sortedArr));
    }
}
