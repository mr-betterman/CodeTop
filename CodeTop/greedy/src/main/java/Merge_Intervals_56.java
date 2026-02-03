import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals_56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Merge_Intervals_56 solver = new Merge_Intervals_56();

        int[][] interval = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int[][] result = solver.merge(interval);
        System.out.println("Maximum children: " + result);
    }
}
