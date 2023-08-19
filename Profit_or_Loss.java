import java.util.Scanner;
public class porl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x<y){
            System.out.println("Profit");
        }
        else if(x==y){
            System.out.println("No profit and No loss");
        }
        else{
            System.out.println("Loss");
        }
    }
}