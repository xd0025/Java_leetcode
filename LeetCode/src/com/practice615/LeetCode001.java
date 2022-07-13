package com.practice615;

import java.util.HashMap;


public class LeetCode001 {
    public int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i< nums.length;i++){
            map.put(nums[i],i);
        }
        for (int j = 0;j<nums.length;j++){
            int m = target - nums[j];
            if(map.containsKey(m) && map.get(m)!=j){
                return new int[] {j,map.get(m)};
            }
        }
        throw new IllegalArgumentException("no num");
    }
}
