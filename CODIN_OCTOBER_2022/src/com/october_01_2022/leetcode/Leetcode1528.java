package com.october_01_2022.leetcode;

public class Leetcode1528 {
    public String restoreString(String s, int[] indices) {
        String res="";
        int n = s.length();
        char temp[] = new char[n];
        char ch;
        for(int i=0;i<n;i++)
        {
            ch = s.charAt(i);
            temp[indices[i]] = ch;
        }
        for(int i=0;i<n;i++)
        {
            res+=temp[i];
        }
        return res;
    }
}
