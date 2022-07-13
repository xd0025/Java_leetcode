package com.Stringstr;

public class Easy001 {
    public int strStr(String haystack,String needle){
        int n = haystack.length(),m = needle.length();
        for (int i = 0;i+m<=n;i++){
            boolean flag = true;
            for (int j = 0;j<m;j++){
                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return -1;
    }
    public int strStr01(String haystack,String needle){
        int n = haystack.length(),m = needle.length();
        if (n==0){
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1,j = 0;i < m;i++){
            while(j > 0 && needle.charAt(i)!=needle.charAt(j)){
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if (j == m){
                return i - m +1;
            }
        }
        return -1;
    }
    public int strStr02(String ss,String pp){
        int n = ss.length(),m = pp.length();
        char[] n1 = ss.toCharArray();
        char[] m1 = ss.toCharArray();
        for (int i=0;i<=n-m;i++){
            int a = i,b = 0;
            while (b < m && n1[a]==m1[b]){
                a++;
                b++;
            }
            if (b == m)return i;
        }
        return -1;

    }

}
