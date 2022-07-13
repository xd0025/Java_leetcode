package com.practice615;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode007 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length <=2)
            return ans;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-2;i++){
            if (nums[i]>0)break;
            if (i>0 && nums[i] ==nums[i-1]) continue;//去重
            int target = -nums[i];
            int left = i+1,right = nums.length - 1;
            while (left < right){
                if (nums[left] + nums[right] ==target){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;right--;
                    while (left<right&&nums[left] ==nums[left -1])left++;
                    while (left<right&&nums[right] ==nums[right+1])right--;
                }else if (nums[left] +nums[right]<target){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num ={-1,0,1,2,-1,-4};
        LeetCode007 rusult = new LeetCode007();
        List<List<Integer>> ans = new ArrayList<>();
        ans = rusult.threeSum(num);
        System.out.println(ans);
    }
}

