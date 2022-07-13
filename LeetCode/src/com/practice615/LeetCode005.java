package com.practice615;

public class LeetCode005 {
    public String longesPalindrom(String s){
        int len = s.length();
        if (len<2){
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        //dp[i][j]表示s[i...j]是否是回文串
        boolean[][] dp = new boolean[len][len];
        //初始化：所有长度为1的字串都是回文串
        for (int i = 0;i<len;i++){
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        //递推开始
        //先枚举子串长度
        for (int L=2;L<=len;L++){
            //枚举左边界，左边界的上限设置宽松一些
            for (int i=0;i<len;i++){
                //由L和i可以确定右边界，即j-i+1=L得
                int j = L+i-1;
                //如果右边界越界退出当前循环
                if (j>=len){
                    break;
                }
                if (charArray[i]!= charArray[j]){
                    dp[i][j] = false;
                }else {
                    if (j-i<3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                //只要dp[i][L]==true成立，就表示字串s[i...j]是回文，记录回文的长度和起始位置
                if (dp[i][j]&&j-i+1>maxLen){
                    maxLen = j - i +1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
    //中心扩散法
    public String longestPalindrome(String s){
        if (s == null||s.length()<1){
            return "";
        }
        int start = 0,end = 0;
        for (int i = 0;i<s.length();i++){
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if (len>end-start){
                start = i-(len-1)/2;
                end = i +len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expandAroundCenter(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left) ==s.charAt(right)){
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
