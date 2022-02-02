package DSA_lab_3;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]={1,2,3,4};
        System.out.println("before");
        for (int i= 1;i<=arr.length;i++){
            System.out.print(arr[i-1]+" , ");
        }
        System.out.println();
        System.out.print("enter the index of element you want to remove : ");
        int n= sc.nextInt();
        System.out.println("after : ");
        for (int i= 1;i<=arr.length;i++){
            if (i-1 == n){
                continue;
            }
            else{
                System.out.print(arr[i-1]+" , ");
            }

        }

    }
}
