package DSA_lab_3;
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the elements of an array : ");
        int n= sc.nextInt();
        char arr[]= new char[n];
        for (int i=0;i<n;i++){
            System.out.print("enter element : "+(i+1)+" : ");
            arr[i]= sc. next(). charAt(0);
        }
        for (int i=0;i<n;i++){
            int aski = arr[i];
            System.out.println("ascii value for "+arr[i]+" is : "+aski);
        }
    }
}
