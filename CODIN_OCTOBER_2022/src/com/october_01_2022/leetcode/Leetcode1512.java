package com.october_01_2022.leetcode;

public class Leetcode1512 {
    public int numIdenticalPairs(int[] nums) {
        int res = 0,n = nums.length;
         for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 if((nums[i] == nums[j])&&(i<j))
                 {
                     res++;
                 }
             }
         }
        return res;
    }
}
