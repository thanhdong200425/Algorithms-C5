public class Exericse9 {
    private final int ARRAY_MAX_LENGTH = 25;
    private final int ARRAY_MIN_LENGTH = 10;

    boolean isHasPositiveNumber(int[] arr) {
        for (int num : arr) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    int[] createArray(int quantity) {
        if (quantity >= ARRAY_MIN_LENGTH && quantity <= ARRAY_MAX_LENGTH) {
            int[] newArr = new int[quantity];
            for (int i = 0; i < quantity; i++) {
                newArr[i] = Exercise8.createRandomNumber();
            }
            return newArr;
        }
        return null;
    }

    int[] reverseArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
        return arr;
    }

    int sumOfPositiveNumber(int[] arr) {
        if (!isHasPositiveNumber(arr)) {
            System.out.println("This array hasn't positive number!");
        } else {
            int result = 0;
            for (int num : arr) {
                if (num > 0) {
                    result += num;
                }
            }
            return result;
        }
        return -1;
    }

    int multiplyOfPositiveNumber(int[] arr) {
        if (!isHasPositiveNumber(arr)) {
            System.out.println("This array hasn't positive number!");
        } else {
            int result = 1;
            for (int num : arr) {
                if (num > 0) {
                    result *= num;
                }
            }
            return result;
        }
        return -1;
    }

    void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        Exericse9 e = new Exericse9();
        int[] array = e.createArray(9);

        if (array != null) {
            Exercise3.print(array);
            System.out.println("--------------");

            e.reverseArray(array);
            Exercise3.print(array);

            System.out.println("---------------");

            e.quickSort(array, 0, array.length - 1);
            Exercise3.print(array);
        }
    }
}