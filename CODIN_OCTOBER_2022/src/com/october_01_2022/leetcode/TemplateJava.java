package com.october_01_2022.leetcode;

import java.util.Scanner;

public class TemplateJava {

    public static void main(String[] args) {
        Leetcode1480 lc1480 = new Leetcode1480();
        int a[] = {1,2,3,4};
        int res[] = lc1480.runningSum(a);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+ " ");
        }
    }
}
