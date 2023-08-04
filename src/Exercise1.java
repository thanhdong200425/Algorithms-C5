public class Exercise1 {
    int[] fiboArray(int n) {
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        int[] arr = e.fiboArray(8);
        e.print(arr);
    }
}
