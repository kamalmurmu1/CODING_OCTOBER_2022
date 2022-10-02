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
    public static int countBits(int a)
    {
        int res = 0 ;
        while(a > 0)
        {
            int d = a%2;
            a = a / 2;
            if(d ==  1)
            {
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
//        Leetcode2429 lc2429 = new Leetcode2429();
//        int a[][] = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
//        int res = lc2429.minimizeXor(79,74);

//        printArray(res);
//        System.out.println(res);
    }
}
