package com.practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums ={0,0,0,1,1,1,2,2,5,5};
        RemoveDuplicates l =new RemoveDuplicates();
        int x=l.removeduplicate(nums);
        System.out.println(x);
        for (int i=0;i<x;i++){
            System.out.print(nums[i]);
        }
    }
    public int removeduplicate(int[] nums){
        int n =nums.length;
        int fast=1,slow=1;
        while(fast<n){
            if (nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
