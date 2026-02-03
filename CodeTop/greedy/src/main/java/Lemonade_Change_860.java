public class Lemonade_Change_860 {
    public boolean lemonadeChange(int[] bills) {
        if(bills==null||bills.length==0||bills[0] !=5){
            return false;
        }

        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int bill: bills){
            if (bill== 5){
                five++;
            }
            if (bill==10){
                if (five==0)
                    return false;
                ten++;
                five--;
            }
            if (bill==20){
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    twenty++;
                } else if (five >= 3) {
                    five -= 3;
                    twenty++;
                } else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lemonade_Change_860 solver = new Lemonade_Change_860();

        int[] candy = {5,5,5,10,5,5,10,20,20,20};

        boolean result = solver.lemonadeChange(candy);
        System.out.println("just result: " + result);
    }
}
