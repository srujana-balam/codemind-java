import java.util.Scanner;
public class hand{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h,n;
        n=sc.nextInt();
        h=(n*(n-1))/2;
        System.out.println(h);
    }
}