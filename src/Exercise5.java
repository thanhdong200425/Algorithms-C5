public class Exercise5 {

    static int[] rearrange(int[] arr) {
        int beginPosition = 0;
        int temp;
        // Represent for the quantity of loop
        for (int i = 2; i <= arr.length; i += 2) {
            temp = arr[i - 1];
            arr[i - 1] = arr[beginPosition];
            arr[beginPosition++] = temp;

        }
        return arr;
    }

    static int[] createArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Exercise4.getRandomNumber();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = Exercise5.createArray(5);
        Exercise3.print(arr);
        System.out.println("----------------");
        Exercise3.print(Exercise5.rearrange(arr));
    }
}
