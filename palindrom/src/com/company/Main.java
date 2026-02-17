package com.company;

import java.util.Scanner;

public class Main {
    static void strongno(int n) {
        int fact=1,sum=0,x=n;
        while(x!=0){
            int r=x%10;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
            x=x/10;
        }
        if(sum==n){
            System.out.println("is strong");
        }
        else {
            System.out.println("is not strong");
        }
    }

    public static void main(String[] args) {
        // write your code here
        int n;
        int sum = 0, r, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to check strong or not");
        n = sc.nextInt();
        /*for (i = 1; i <= n; i++) {
         for(int j=1;j<=i;j++){
            if (i%j == 0) {
                sum++;
            }
            // sum=0;
         }
            if (sum == 2) {
                System.out.println("prime number is " +i);
            }
            sum=0;
            // primeornot(n);
        } */
        strongno(n);
    }
}
