package com.practice;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,8,5,5,5,5,5,4,4,4};
        RemoveElement l = new RemoveElement();
        int x=l.removeElement(nums,5);
        System.out.println(x);
        for (int i =0;i<x;i++){
            System.out.print(nums[i]);
        }
    }
    public int removeElement(int[] nums,int val){
        int n=nums.length;
        int left=0;
        for (int right =0;right<n;right++){
            if (nums[right]!=val){
                nums[left]=nums[right];
                ++left;
            }
        }
        return left;
    }
}
