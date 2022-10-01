package com.october_01_2022.leetcode;

import java.util.Scanner;

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
        Leetcode1528 lc1528 = new Leetcode1528();
        int a[] = {0,1,2};
        String s = "abc";
        String res = lc1528.restoreString(s,a);
//        printArray(res);
        System.out.println(res);
    }
}
