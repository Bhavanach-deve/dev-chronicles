public class Main {
    public static void main(String[] args) {
        int temp = 0;
        int nums[] = {6, 5, 8, 9, 2, 4};
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
            System.out.println();
            System.out.println("After sorting");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }