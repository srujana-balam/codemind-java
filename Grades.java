import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        double per=(a+b+c+d+e)/5;
        if(per>=90){
            System.out.println("Grade A");
        }
        else if(per>=80){
            System.out.println("Grade B");
        }
        else if(per>=70){
            System.out.println("Grade C");
        }
        else if(per>=60){
            System.out.println("Grade D");
        }
        else if(per>=40){
            System.out.println("Grade E");
        }
        else if(per<40){
            System.out.println("Grade F");
        }
        
    }
}