import java.util.*;

class solution{
    public static void main(String args[]){
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }

} 

// Algorithm: Richest Customer Wealth

// Input: A 2D array arr[m][n] where:

// m = number of customers (rows)

// n = number of bank accounts per customer (columns).

// Output: Maximum wealth among all customers.
// Steps:

// Initialize a variable maxWealth = 0.

// For each customer i (0 to m-1):
// a. Set sum = 0.
// b. For each bank account j (0 to n-1):

// Add arr[i][j] to sum.
// c. Compare sum with maxWealth.

// If sum > maxWealth, update maxWealth = sum.

// After finishing all rows, return maxWealth. nhi