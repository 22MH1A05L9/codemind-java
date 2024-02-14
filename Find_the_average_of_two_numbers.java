import java.util.Scanner;
public class num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = (a+b)/2;
        System.out.printf("%.4f",c);
    }
}