import java.util.Scanner;
public class romeo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int ans = (5*X)+(10*Y);
        System.out.printf("%d",ans/Z);
    }
}