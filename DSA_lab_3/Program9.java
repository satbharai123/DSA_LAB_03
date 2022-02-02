package DSA_lab_3;

public class Program9 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,2,3,9,5};
        int count=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==arr1[i]){
                count++;
            }
        }
        if (count==5){
            System.out.println("the arrays are equal");
        }
        else{
            System.out.println("the arrays are not equal");
        }
    }
}
