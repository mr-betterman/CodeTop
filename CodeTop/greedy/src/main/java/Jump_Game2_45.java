public class Jump_Game2_45 {
    public int jumpMaxSteps(int[] nums) {
        int result = 0;
        if(nums==null||nums.length<=1)
            return result;
        int farthest = 0;
        int current_end = 0;
        for(int i=0; i<nums.length; i++){
            farthest = Math.max(i+nums[i], farthest);
            if (i==current_end){
                result+=1;
                current_end = farthest;
                if (farthest>=(nums.length-1)){
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Jump_Game2_45 solver = new Jump_Game2_45();

        int[] nums = {0};

        int result = solver.jumpMaxSteps(nums);
        System.out.println("just max steps: " + result);
    }
}
