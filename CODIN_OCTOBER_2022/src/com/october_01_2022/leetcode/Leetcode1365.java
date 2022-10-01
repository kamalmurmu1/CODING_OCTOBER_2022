package com.october_01_2022.leetcode;

public class Leetcode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int countA[] = new int[101];
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            countA[nums[i]]++;
        }
        for(int i=1;i<101;i++)
        {
            countA[i]+=countA[i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = 0;
            }
            else{
                nums[i] = countA[nums[i]-1];
            }
        }
        return nums;
    }
}
