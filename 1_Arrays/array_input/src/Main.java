import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String ip = scanner.nextLine();
        String[] words = ip.split(" ");
        reverse(words);
        join(words);
    }
    public static void reverse(String[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=1;
            j-=1;
        }
    }
    public static void join(String[] arr){
        String sentence="";
        for(String x:arr){
            sentence+=x;
            sentence+=" ";
        }
        System.out.println(sentence);
    }
}
