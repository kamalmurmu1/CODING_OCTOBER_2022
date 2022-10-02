package com.october_02_2022.leetcode;

public class TemplateJava {

    public static void printArray(int a[])
    {
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Leetcode2428 lc2428 = new Leetcode2428();
        int a[][] = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
        int res =lc2428.maxSum(a);

//        printArray(res);
        System.out.println(res);
    }
}
