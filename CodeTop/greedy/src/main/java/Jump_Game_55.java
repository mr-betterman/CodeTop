public class Jump_Game_55 {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length == 0){
            return true;
        }
        int cover = 0;
        for(int i=0; i<=cover; i++){
            cover = Math.max(i+nums[i], cover);
            if(cover>=nums.length-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Jump_Game_55 solver = new Jump_Game_55();

        int[] nums = {2,3,1,1,4};

        boolean result = solver.canJump(nums);
        System.out.println("just result: " + result);
    }
}
