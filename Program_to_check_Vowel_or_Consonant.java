import java.util.Scanner;
public class vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ans = sc.next().charAt(0);
        if(ans=='A'||ans == 'E'||ans == 'I'||ans == 'O'||ans == 'u'||ans=='a'||ans == 'e'||ans == 'i'||ans == 'o'||ans == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}