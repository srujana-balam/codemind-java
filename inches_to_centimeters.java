import java.util.Scanner;
public class height{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double in,h;
        h=sc.nextDouble();
        in=2.54*h;
        System.out.printf("%.2f",in);
    }
}