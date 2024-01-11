import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp= sc.nextInt();
        int sp = sc.nextInt();
        float p =sp-cp;
        double ans=(p*100)/cp;
        System.out.printf("%.2f",ans);
    }
}