public class Wiggle_Subsequence_376 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;

        int count = 1;

        int i = 1;
        while (i < n && nums[i] == nums[i - 1]) {
            i++;
        }
        if (i == n) return 1;
        boolean isUp = nums[i] > nums[i - 1];
        count++;
        for (i = i + 1; i < n; i++) {
            if (isUp && nums[i] < nums[i - 1]) {
                count++;
                isUp = false; // 更新方向为下降
            } else if (!isUp && nums[i] > nums[i - 1]) {
                count++;
                isUp = true;  // 更新方向为上升
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Wiggle_Subsequence_376 solver = new Wiggle_Subsequence_376();

        int[] nums = {1,7,4,9,2,5};

        int result = solver.wiggleMaxLength(nums);
        System.out.println("Maximum subArray: " + result);
    }
}
