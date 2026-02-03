import java.util.Arrays;
import java.util.stream.IntStream;

public class Maximize_Sum_Of_Array_After_K_Negations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Integer[] numsArr = IntStream.of(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(numsArr, (o1, o2) -> Math.abs(o2) - Math.abs(o1));
        for(int i=0; i<numsArr.length; i++){
            if (numsArr[i] < 0 && k > 0) {
                numsArr[i] = -numsArr[i];
                k--;
            }
        }
        if (k % 2 == 1) {
            numsArr[numsArr.length - 1] = -numsArr[numsArr.length - 1];
        }

        return Arrays.stream(numsArr).mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Maximize_Sum_Of_Array_After_K_Negations solver = new Maximize_Sum_Of_Array_After_K_Negations();

        int[] nums = {4,2,3};
        int k = 1;

        int result = solver.largestSumAfterKNegations(nums, k);
        System.out.println("just result: " + result);
    }
}
