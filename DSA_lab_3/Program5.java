package DSA_lab_3;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        String arr[]= {"hello","sat","aissssha","sadad","a","fsgfdyw","adgwjhe","swgde","sghdwjhejd","one","hello","hehhe","asdhjkhe","edhwuiedui","gsdjhgj","csdjhj","dtrsdtr","ftyfyugjh","ftyyughhjg","ftyfygfvyj","gyutgyuh","fgyfhg","gyugyujh","gyuuh","gjhjkhuihuhjk","gjhgjh","gygyutyugyuh","fghfuhg","fghfh","fgjhgjh"};
        String max="";
        String min ="we";
        for (int i=29;i>=0;i--){

            if (arr[i].length()>max.length() ){
                max = arr[i];

            }
            if (arr[i].length() < min.length()){
                min = arr[i];

            }
        }
           System.out.println(max+" is of max length");
            System.out.println(min+" is of min length");


    }
}
