import java.util.Random;

public class Exercise4 {
    static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(1, 1000);
    }

    static int[] createArray(int quantity) {
        int[] arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            arr[i] = getRandomNumber();
        }
        return arr;
    }

    static int[] combineArray(int[] a, int[] b) {
        int length1 = a.length;
        int length2 = b.length;
        int num1 = 0, num2 = 0;
        int[] c = new int[length1 + length2];
        try {
            for (int i = 0; i < c.length; i++) {
                if (i % 2 == 0 && num1 < length1) {
                    c[i] = a[num1++];
                } else if (i % 2 != 0 && num2 < length2) {
                    c[i] = b[num2++];
                } else if (num1 >= length1) {
                    c[i] = b[num2++];
                } else if (num2 >= length2) {
                    c[i] = a[num1++];
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return c;
    }


    public static void main(String[] args) {
        int[] a = Exercise4.createArray(10);
        int[] b = Exercise4.createArray(6);
        int[] c = Exercise4.combineArray(a, b);

        Exercise3.print(a);
        System.out.println("-----");
        Exercise3.print(b);
        System.out.println("-----");
        Exercise3.print(c);
    }
}
