import java.util.Scanner;
public class porf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        if(a>34 && b>34 && c>34 && d>34 && e>34){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
    }
}