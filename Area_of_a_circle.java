import java.util.Scanner;
public class circlr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double ans = (3.14*a*a);
        System.out.printf("%.2f",ans);
    }
}