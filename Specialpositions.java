import java.util.*;
public class Specialpositions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the Column");
        int col=sc.nextInt();
        int[][] Arr = new int[row][col];
        for(int i = 0 ;i<row;i++){
            for(int j = 0;j<col;j++){
                Arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
        int m = Arr.length;
        int n = Arr[0].length;
        int[] rowSum = new int[row];
        int[] colSum =new int[col];
        for(int i = 0 ;i<row;i++){
            for(int j =0;j<col;j++){
                if(Arr[i][j]==1){
                    rowSum[i]+= Arr[i][j];
                    colSum[j]+= Arr[i][j];

                }
                 }
        }
        int count = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(Arr[i][j] == 1 && rowSum[i] == 1 && colSum[j] ==1){
                    count ++;
                }
            }
        }
        System.out.println(count);

    }
    
}
// Algorithm for this code:

// Input the number of rows and columns.

// Read the matrix Arr[row][col].

// Initialize two arrays:

// rowSum[row] → to count 1’s in each row

// colSum[col] → to count 1’s in each column

// Traverse the matrix:

// If Arr[i][j] == 1, then:

// Increase rowSum[i] by 1

// Increase colSum[j] by 1

// Initialize count = 0.

// Traverse the matrix again:

// If Arr[i][j] == 1 and rowSum[i] == 1 and colSum[j] == 1, then increment count.

// Print the final count.

// Example Run:
// Step 1: Initialize

// rowSum = [0, 0, 0] (3 rows → initially 0 ones in each row)

// colSum = [0, 0, 0] (3 columns → initially 0 ones in each column)

// Step 2: Traverse each cell

// 👉 Start with cell (0,0):

// Arr[0][0] = 1

// So:

// rowSum[0]++ → rowSum[0] = 1

// colSum[0]++ → colSum[0] = 1

// Now:
// rowSum = [1, 0, 0]
// colSum = [1, 0, 0]

// 👉 Cell (0,1):

// Arr[0][1] = 0 → Do nothing

// 👉 Cell (0,2):

// Arr[0][2] = 0 → Do nothing

// 👉 Cell (1,0):

// Arr[1][0] = 0 → Do nothing

// 👉 Cell (1,1):

// Arr[1][1] = 0 → Do nothing

// 👉 Cell (1,2):

// Arr[1][2] = 1

// So:

// rowSum[1]++ → rowSum[1] = 1

// colSum[2]++ → colSum[2] = 1

// Now:
// rowSum = [1, 1, 0]
// colSum = [1, 0, 1]

// 👉 Cell (2,0):

// Arr[2][0] = 1

// So:

// rowSum[2]++ → rowSum[2] = 1

// colSum[0]++ → colSum[0] = 2

// Now:
// rowSum = [1, 1, 1]
// colSum = [2, 0, 1]
