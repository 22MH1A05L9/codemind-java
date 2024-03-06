import java.util.*;
public class array{
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int index(int[] arr,int ele)
    {
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int c =0;
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[] = Arrays.copyOf(arr,a);
        Arrays.sort(arr1);
        for(int i=0;i<a;i++){
            if(arr[i]!=arr1[i]){
                c+=1;
                swap(arr,i,index(arr,arr1[i]));
            }
        }
        System.out.println(c);
    }
}