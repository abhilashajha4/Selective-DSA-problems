import java.util.Scanner;

public class Non_descreaing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++ ;
            }
        }
        if(count>1){
            System.out.println("False");
        }
        else{
            System.err.println("True");
        }

    }
    
}
