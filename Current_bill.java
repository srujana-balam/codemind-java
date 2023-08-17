import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int units,uc=0;
        units=sc.nextInt();
        double bill,sr,tb;
        if(units<200){
            bill=units*1.20;
        }
        else if(units>=200 && units<400){
            bill=units*1.50;
        }
        else if(units>=400 && units<600){
            bill=units*1.50;
        }
        else{
            bill=units*2.00;
        }
        if(bill>=400){
            sr=bill*0.15;
            tb=bill+sr;
            System.out.printf("%.2f",tb);
        }
        else{
            tb=bill+100;
            System.out.printf("%.2f",tb);
        }
    }
}