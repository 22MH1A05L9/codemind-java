import java.util.Scanner;
public class donation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch =sc.next().charAt(0);
        if(ch>='A'&& ch<='Z'){
            System.out.println("uppercase alphabet");
        }
        else if(ch>='a'&& ch<='z'){
            System.out.println("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}