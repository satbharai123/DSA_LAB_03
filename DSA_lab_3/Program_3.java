package DSA_lab_3;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[] = {1,3,2,4,5,6};
        System.out.print("enter the number : ");
        int n= sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                System.out.println("The element exists in the array at the index "+(i+1));
            }
        }
    }
}
