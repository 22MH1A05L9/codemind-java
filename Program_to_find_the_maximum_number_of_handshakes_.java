import java.util.Scanner;
public class hand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n-1)*(n)/2;
        System.out.println(a);
    }
}