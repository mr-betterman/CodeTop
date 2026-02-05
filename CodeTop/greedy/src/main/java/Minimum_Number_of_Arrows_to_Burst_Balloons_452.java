import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons_452 {
    public int findMinArrowShots(int[][] points) {
        if (points==null || points.length==0||points[0].length==0){
            return 0;
        }
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int firstEnd = points[0][1];

        for (int[] p : points) {
            if (p[0] > firstEnd) {
                arrows++;
                firstEnd = p[1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        Minimum_Number_of_Arrows_to_Burst_Balloons_452 solver = new Minimum_Number_of_Arrows_to_Burst_Balloons_452();

        int[][] people = {
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };

        int result = solver.findMinArrowShots(people);
        System.out.println("Maximum children: " + result);
    }
}
