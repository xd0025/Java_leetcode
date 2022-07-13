package com.practice;

public class Palindrome {
    public static void main(String[] args) {
        int x=121;
        boolean y=palindrome(x);
        System.out.println(y);
    }
    public static boolean palindrome(int x){
        String s =Integer.toString(x);
        String reverse ="";
        int length =s.length();
        for (int i=0;i<length;i++){
            reverse=s.charAt(i)+reverse;
        }
        if (s.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }
    //leetcode别人的做法
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

}
