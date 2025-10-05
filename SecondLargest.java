                                             // OPTIMAL APPROACH
import java.util.*;
public class SecondLargest{
    public static void main(String[] args) {
        int arr[] = {12,35,1,10,34,1};
        int firstLar = Integer.MIN_VALUE;
        int SecondLar = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] > firstLar){
                SecondLar = firstLar;
                firstLar = arr[i];
            }
            else if(arr[i]>SecondLar && arr[i]!= firstLar ){
                SecondLar = arr[i];
            }
        }
        if(SecondLar == Integer.MIN_VALUE){
            System.out.println("No second largest is found ");
        }
        else{
            System.out.println("second largest is found " + SecondLar);
        }
    }
}

// the time complexity here is 0(n) becuase we are traversing in a array 
