import java.util.Random;

public class Exercise8 {
    private final int ARRAY_MIN_LENGTH = 15;
    private final int ARRAY_MAX_LENGTH = 30;

    static int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    int[] createArray(int quantity) {
        if (quantity > ARRAY_MAX_LENGTH || quantity < ARRAY_MIN_LENGTH) {
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
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    int partition(int[] arr, int low, int high) {
        int pivotTemp = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivotTemp) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    int[] sortAscending(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            sortAscending(arr, low, pivot - 1);
            sortAscending(arr, pivot + 1, high);
        }
        return arr;
    }

    int sumOfPerfecSquareNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            if (checkPerfectSquareNumber(num)) {
                result += num;
            }
        }
        if (result == 0) {
            System.out.println("There haven't a perfect square number");
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise8 e = new Exercise8();
        int[] newArr = e.createArray(15);

        if (newArr != null) {
            int[] sortedArr = e.sortAscending(newArr, 0, newArr.length - 1);
            Exercise3.print(sortedArr);

            System.out.println(e.sumOfPerfecSquareNumber(newArr));
        }
    }
}
