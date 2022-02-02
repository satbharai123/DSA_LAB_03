package DSA_lab_3;

public class Program10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int count=0,m_num=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=i+1){
                count++;
                m_num=arr[i-1]+count;
                break;
            }
        }
        if (count>0){
            System.out.println("the missing number is : "+m_num);
        }
    }
}
