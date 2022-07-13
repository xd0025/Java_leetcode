package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
    //LeetCode1两数之和
public class Sum {
    public static void main(String[] args) {
        int[] arr ={15,11,2,7};
        //sum(arr,9);
        int[] w=twoSum2(arr,9);
        System.out.println(Arrays.toString(w));


    }
    public static void sum(int[] arr, int target){
        for (int i =0;i<arr.length;i++){
            int m=arr[i];
            int n =target -arr[i];
            for (int j =i+1;j<arr.length;j++){
                if(arr[j]==n){
                    System.out.println("下标"+i+"和"+j);
                }
            }
        }
    }
    
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                    return new int[]{i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("no this sum");
    }
    //一遍哈希表
    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 2)
            return res;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }



}
