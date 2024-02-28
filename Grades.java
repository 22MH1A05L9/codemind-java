import java.util.Scanner;
public class grades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double s1 = (double)sc.nextInt();
        double s2 = (double)sc.nextInt();
        double s3 = (double)sc.nextInt();
        double s4 = (double)sc.nextInt();
        double s5 = (double)sc.nextInt();
        double percentage=((s1+s2+s3+s4+s5)/500)*100;
        if(percentage >= 90){
            System.out.println("Grade A");
        }
        else if(percentage >= 80){
            System.out.println("Grade B");
        }
        else if(percentage >= 70){
            System.out.println("Grade C");
        }
        else if(percentage >= 60){
            System.out.println("Grade D");
        }
        else if(percentage >= 40){
            System.out.println("Grade E");
        }
        else if(percentage < 40){
            System.out.println("Grade F");
        }
        
    }
}