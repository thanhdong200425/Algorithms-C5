import java.util.HashSet;

public class First_Test_Exercise {
    public int countValidPairs(int[] numbers, int k) {
        // Dùng để lưu giá trị đã xuất hiện  trong 1  mảng.
        HashSet<Integer> numSet = new HashSet<>();
        int count = 0;

        for (int num : numbers) {
            //
            if (numSet.contains(num - k)) {
                count++;
            }
            if (k != 0 && numSet.contains(num + k)) {
                count++;
            }
            numSet.add(num);
        }

        return count;
    }

    public static void main(String[] args) {
        First_Test_Exercise counter = new First_Test_Exercise();

        int[] numbers1 = {1, 1, 1, 2};
        int k1 = 1;
        int result1 = counter.countValidPairs(numbers1, k1);
        System.out.println("Example 1: " + result1);

        int[] numbers2 = {1, 2, 2, 3};
        int k2 = 0;
        int result2 = counter.countValidPairs(numbers2, k2);
        System.out.println("Example 2: " + result2);
    }
}
