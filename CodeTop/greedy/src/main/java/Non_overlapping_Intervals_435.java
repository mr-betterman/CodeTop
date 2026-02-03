import java.util.Arrays;

public class Non_overlapping_Intervals_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            }
        }
        return intervals.length-count;
    }

    public static void main(String[] args) {
        Non_overlapping_Intervals_435 solver = new Non_overlapping_Intervals_435();

        int[][] interval = {
                {1, 2},
                {1, 2},
                {1, 2}
        };
        int result = solver.eraseOverlapIntervals(interval);
        System.out.println("Maximum children: " + result);
    }
}
