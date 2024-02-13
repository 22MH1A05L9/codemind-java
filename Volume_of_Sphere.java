import java.util.Scanner;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double sphere=(4.0/3.0)*(3.14*Math.pow(a,3));
        System.out.printf("%.2f",sphere);
        
    }
}