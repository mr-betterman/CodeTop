import java.util.ArrayList;
import java.util.List;

public class Partition_Labels_763 {
    public List<Integer> partitionLabels(String s) {
        String[] list = s.split("");
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Partition_Labels_763 solver = new Partition_Labels_763();
        String s = "ababcbacadefegdehijhklij";

        List<Integer> result= solver.partitionLabels(s);
        System.out.println("Maximum children: " + result);
        //Input: s = "ababcbacadefegdehijhklij"
        //Output: [9,7,8]
        //Explanation:
        //The partition is "ababcbaca", "defegde", "hijhklij".
        //This is a partition so that each letter appears in at most one part.
        //A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
        //Example 2:
        //
        //Input: s = "eccbbbbdec"
        //Output: [10]
    }
}
