import java.util.Scanner;
public class compoundInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p,t;
        double r,ci;
        p=sc.nextInt();
        r=sc.nextDouble();
        t=sc.nextInt();
        ci=p*Math.pow((1+r/100),t)-p;
        System.out.printf("%.2f",ci);
    }
}