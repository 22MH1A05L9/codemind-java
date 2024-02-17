import java.util.Scanner;
public class vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}