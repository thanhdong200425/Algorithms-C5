public class Exericse9 {
    int[] createArray(int quantity) {
        if (quantity >= 10 && quantity <= 25) {
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
        int result = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }
        if (result == 0) {
            System.out.println("This array hasn't positive number!");
        }
        return result;
    }

    int multiplyOfPositiveNumber(int[] arr) {
        int result = 1;
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                result *= arr[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("This array hasn't positive number!");
        }
        return result;
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    static int partition(int[] arr, int low, int high) {
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

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }


    public static void main(String[] args) {
        Exericse9 e = new Exericse9();
        int[] array = e.createArray(10);

        Exercise3.print(array);
        System.out.println("--------------");

        e.reverseArray(array);
        Exercise3.print(array);

        System.out.println("---------------");

        Exericse9.quickSort(array, 0, array.length - 1);
        Exercise3.print(array);
    }
}
