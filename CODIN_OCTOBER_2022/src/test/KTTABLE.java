package test;

import java.io.*;
import java.util.Scanner;

public class KTTABLE {

    static Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for(int i=0;i<n;i++) b[i] = sc.nextInt();

        int res = 0 ,test=0;
        for(int i=0;i<n;i++)
        {
            int test1 = a[i] - test;
            if(test1 >= b[i])
            {
                res++;
            }
            test = a[i];
        }
        System.out.println(res);

    }
    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        while(t-- > 0)
        {
            solve();
        }
    }
}
