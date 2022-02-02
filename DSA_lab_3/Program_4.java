package DSA_lab_3;
import java.util.Scanner;
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string array");
        String arr[]=new String[4];
        for (int i=0;i<arr.length;i++){
            System.out.print("enter element "+(i+1)+" : ");
            arr[i]= sc.next();

        }
        System.out.println("before");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
        System.out.println("after : ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" , ");
        }
    }
}
