package org;

import java.util.Arrays;

public class Assign_Cookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int childIdx = 0;
        int cookieIdx = 0;
        while (childIdx < g.length && cookieIdx < s.length) {
            if (s[cookieIdx]>=g[childIdx]){
                result++;
                childIdx++;
            }
            cookieIdx++;
        }
        return result;
    }

    public static void main(String[] args) {
        Assign_Cookies_455 solver = new Assign_Cookies_455();

        int[] children = {1,2,3};
        int[] s = {1,1};
        //You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
        //And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
        //You need to output 1.

        int result = solver.findContentChildren(children, s);
        System.out.println("Maximum children: " + result);
    }
}
