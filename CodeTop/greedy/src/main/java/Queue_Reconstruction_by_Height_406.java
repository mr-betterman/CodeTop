import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue_Reconstruction_by_Height_406 {
    public int[][] reconstructQueue(int[][] peoples) {
        Arrays.sort(peoples, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });
        List<int[]> result = new ArrayList<>();
        for (int[] p : peoples) {
            result.add(p[1], p);
        }
        return result.toArray(new int[peoples.length][]);
    }

    public static void main(String[] args) {
        Queue_Reconstruction_by_Height_406 solver = new Queue_Reconstruction_by_Height_406();

        int[][] people = {
                {7, 0},
                {4, 4},
                {7, 1},
                {5, 0},
                {6, 1},
                {5, 2}
        };

        int[][] result = solver.reconstructQueue(people);
        System.out.println("Maximum children: " + result);
    }
}
