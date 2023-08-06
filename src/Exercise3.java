import java.util.Random;

class Exercise3 {

     int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(50) * 5;
    }

    int[] createArray(int quantity) {
        int[] arr = new int[quantity];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber();
        }
        return arr;
    }

    int[] FirstArray(int[] arr) {
        int start = 0, end = 0;
        int length = arr.length;
        int temp;
        for (int i = 0; i <= length / 2; i++) {
            if (arr[i] % 2 != 0 && arr[i] % 5 == 0) {
                temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            } else if (arr[i] % 2 == 0 && arr[i] % 5 == 0) {
                temp = arr[length - 1 - end];
                arr[length - 1 - end] = arr[i];
                arr[i] = temp;
                end++;
            }
        }
        return arr;
    }

    int[] SecondArray(int[] arr) {
        int[] newArr = arr;
        int temp;
        int length = arr.length;
        for (int i = 0; i <= length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
        return newArr;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Exercise3 e2 = new Exercise3();
        int[] arr = e2.createArray(10);
        e2.print(e2.FirstArray(arr));
        e2.print(e2.SecondArray(e2.FirstArray(arr)));
    }
}