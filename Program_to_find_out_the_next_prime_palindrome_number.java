import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j=a+1;
        while(j<=30000){
            if(prime(j)==1 && palin(j)==1){
                System.out.println(j);
                break;
            }
            else{
                j+=1;
            }
        }
    }
    public static int prime(int a){
        int c = 0;
        for (int i=1;i<=a;i++){
            if(a%i==0){
                c+=1;
            }
        }
        if(c==2){
            return 1;
        }
        else{
          return 0;
        }
    }
    public static int palin(int a){
        int r=0;
        int n=a;
        while(a!=0){
            int t=a%10;
            r=(r*10)+t;
            a=a/10;
        }
        if(r==n){
            return 1;
        }
        else{
            return 0;
        }
    }
}