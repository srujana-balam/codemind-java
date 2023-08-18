import java.util.Scanner;
public class contest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,a,b;
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        if(x<=((1*a)+(2*b))){
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
    }
}