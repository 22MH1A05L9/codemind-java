import java.util.Scanner;
public class far{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f =32+(c*(1.8));
        System.out.printf("%.2f",f);
    }
}