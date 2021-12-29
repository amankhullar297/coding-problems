/*
Given two strings ‘X’ and ‘Y’, find the length of the minimum string that contains both X and Y.

Approach: Calculate the length of maximum common subsequence and subtract it with the sum of both the strings.

Input:
    x = "abcde"
    y = "bdefklmn"

Output: 10

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class ShortestCommonSuperSequence {
    public int shortestCommonSuperSequence(String x, String y){
        int maxCommonSubsequence = new CommonSubSequenceProblem().commonSubsequenceTopDown(x, y);
        return x.length() + y.length() - maxCommonSubsequence;
    }

    public String printShortestCommonSuperSequence(String x, String y){
        String lcs = new CommonSubSequenceProblem().printLongestCommonSubsequence(x, y);

        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();

        for(char ch: lcs.toCharArray()){
            while(i < x.length() && x.charAt(i) != ch)
                ans.append(x.charAt(i++));

            while(j < y.length() && y.charAt(j) != ch)
                ans.append(y.charAt(j++));

            if(x.charAt(i) == ch && y.charAt(j) == ch) {
                ans.append(ch);
                i++;
                j++;
            }
        }

        while(i < x.length())
            ans.append(x.charAt(i++));

        while(j < y.length())
            ans.append(y.charAt(j++));

        return ans.toString();
    }
}