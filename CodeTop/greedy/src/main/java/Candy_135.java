import java.util.Arrays;

public class Candy_135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        for(int i = 1; i<candy.length; i++){
            if (ratings[i]> ratings[i-1]){
                candy[i] = candy[i-1] +1;
            }
        }
        for(int i = candy.length-1; i>0; i--){
            if (ratings[i]<ratings[i-1]){
                candy[i-1] = Math.max(candy[i]+1, candy[i-1]);
            }
        }
        return Arrays.stream(candy).sum();
    }

    public static void main(String[] args) {
        Candy_135 solver = new Candy_135();

//        int[] candy = {1,2,2,5,4,3,2};
        int[] candy = {1,3,4,5,2};

        int result = solver.candy(candy);
        System.out.println("just result: " + result);
    }
}
