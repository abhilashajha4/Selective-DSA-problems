import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for(int i = 0;i<N;i++){
            Arr[i] = sc.nextInt();
        }
        int max = Integer .MIN_VALUE;
        for(int j = 0 ;j<N;j++){
            int cal = Arr[j]/10;
            if(cal>max){
                max = cal;
            }
            }
            System.out.println(max);
        }
    }
    

