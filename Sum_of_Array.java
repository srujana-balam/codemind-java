import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}