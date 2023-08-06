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
                result*=arr[i];
                count++;
            }
        }
        if(count == 0) {
            System.out.println("This array hasn't positive number!");
        }
        return result;
    }

    public static void main(String[] args) {
        Exericse9 e = new Exericse9();
        int[] array = e.createArray(11);

        Exercise3.print(array);
        System.out.println("--------------");

        e.reverseArray(array);
        Exercise3.print(array);

        System.out.println(e.sumOfPositiveNumber(array));
        System.out.println(e.multiplyOfPositiveNumber(array));
    }
}
