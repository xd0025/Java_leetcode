package com.array;

public class Easy001plusone {
    public int[] plusOne(int[] digits){
        int len = digits.length;
        for (int i = len -1;i>=0;i--){
            digits[i] = (digits[i]+1)%10;
            if (digits[i]!=0){
                return digits;
            }
        }
        digits = new int[len+1];
        digits[0] =1;
        return digits;
    }
    public int[] plusOne01(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
