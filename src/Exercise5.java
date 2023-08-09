public class Exercise5 {

    static int[] rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[left++] = arr[i];
            } else {
                newArr[right--] = arr[i];
            }
        }
        return newArr;
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
