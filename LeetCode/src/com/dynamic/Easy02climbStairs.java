package com.dynamic;

public class Easy02climbStairs {
    public int climbStairs(int n){
        int p =0,q=0,r = 1;
        for (int i = 1;i<=n;++i){
            p = q;
            q = r;
            r = q + p;
        }
        return r;
    }
}
