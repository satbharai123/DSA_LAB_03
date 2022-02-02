package DSA_lab_3;
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[20];
        int temp=0;
        for (int i=0;i<arr.length;i++){
            System.out.print("enter element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("the 12th minimum number = "+arr[arr.length-9]);
        System.out.println("the 3rd largest number = "+arr[arr.length-3]);

    }
}
