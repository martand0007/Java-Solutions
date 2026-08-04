import java.util.Scanner;
public class EquilibriumIndex {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] nums = {5, 6, 7, 8, 9, 20, 3, 3};

            int[] left_sum = new int[nums.length];
            left_sum[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                left_sum[i] = left_sum[i - 1] + nums[i];
            }

            int[] right_sum = new int[nums.length];
            right_sum[nums.length - 1] = nums[nums.length - 1];

            for (int i = nums.length - 2; i >= 0; i--) {
                right_sum[i] = right_sum[i + 1] + nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                if (left_sum[i] == right_sum[i]) {
                    System.out.println("Index = " + i);
                    System.out.println("Element = " + nums[i]);
                }
            }

            sc.close();
        }
    }