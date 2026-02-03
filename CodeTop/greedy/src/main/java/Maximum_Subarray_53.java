public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        if(nums.length==0)
            return 0;
        for(int i = 0; i<nums.length; i++){
            count += nums[i];
            if (count>result){
                result = count;
            }
            if (count<=0){
                count=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Maximum_Subarray_53 solver = new Maximum_Subarray_53();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = solver.maxSubArray(nums);
        System.out.println("Maximum children: " + result);
    }
}
