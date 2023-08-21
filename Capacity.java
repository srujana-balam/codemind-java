import java.util.Scanner;
public class capacity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        int n=(2*t*s*b*512)/1024;
        System.out.printf("%d KB",n);
    }
}