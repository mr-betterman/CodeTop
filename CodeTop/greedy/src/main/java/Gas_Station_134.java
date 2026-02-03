public class Gas_Station_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int currentSum = 0;
        int totalSum = 0;
        for(int i = 0; i<gas.length; i++){
            currentSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (currentSum<0){
                index = i+1;
                currentSum = 0;
            }
        }
        if (totalSum<0)
            return -1;
        return index;
    }

    public static void main(String[] args) {
        Gas_Station_134 solver = new Gas_Station_134();

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        int result = solver.canCompleteCircuit(gas, cost);
        System.out.println("just result: " + result);
    }
}
