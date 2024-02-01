import java.util.Scanner;
public class year{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String bStr = String.valueOf(a);
        System.out.print(bStr.substring(bStr.length()-2));
    }
}
