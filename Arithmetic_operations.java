import java.util.Scanner;
public class ope{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int Sum=a+b;
    int Difference=a-b;
    int Product=a*b;
    int Quotient=a/b;
    int Remainder=a%b;
    System.out.printf("Sum:%d",Sum);
    System.out.printf("
Difference:%d",Difference);
    System.out.printf("
Product:%d",Product);
    System.out.printf("
Quotient:%d",Quotient);
    System.out.printf("
Remainder:%d",Remainder);
    
    
}
}