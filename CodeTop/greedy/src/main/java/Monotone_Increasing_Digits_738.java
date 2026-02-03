public class Monotone_Increasing_Digits_738 {
    public int monotoneIncreasingDigits(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int flag = 0;
        for(int i = chars.length-1; i>0; i--){
            if (chars[i-1] > chars[i]){
                chars[i - 1]--; // 前一位减 1
                flag = i;       // 更新需要变 9 的起始位置
            }
        }
        for (int i = flag; i < chars.length; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(new String(chars));
    }

    public static void main(String[] args) {
        Monotone_Increasing_Digits_738 solver = new Monotone_Increasing_Digits_738();
        int n = 322;
        int result = solver.monotoneIncreasingDigits(n);
        System.out.println("Maximum children: " + result);
    }
}
