import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;

public class spiral {
    public static List<Integer> spiralOrder(int[][] Arr){
        Scanner sc  = new Scanner(System.in);
        int m ,n;
        //  m = sc.nextInt();
        //  n  = sc.nextInt();
        
        m = Arr.length;
        n = Arr[0].length;
        int srow = 0;
        int erow = m - 1;
        int scol = 0;
        int ecol = n - 1;
        int tot  = Arr.length * Arr[0].length;
        int c = 0;
        List<Integer> list = new ArrayList<>();
        while(c<tot){
            for(int i = scol;i<=ecol && c<tot;i++){
                list.add(Arr[srow][i]);
                c++;
            }
            srow++;
            for(int i = srow;i<=erow && c<tot;i++){
                list.add(Arr[i][ecol]);
                c++;
            }
            ecol--;
            for(int i = ecol;i>=scol && c<tot ;i--){
                list.add(Arr[erow][i]);
                c++;
            }
            erow--;
            for(int i = erow;i>=srow && c<tot;i--){
                list.add(Arr[i][scol]);
                c++;
            }
            scol++;
        }
        return list;
    }
    public static void main(String args[]){
        int[][] Arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; 
        List<Integer> result = spiralOrder(Arr);
        System.out.println(result);
    }
    
}

// Algorithm

// We want to traverse a matrix in spiral order (clockwise).

// Steps:

// Initialize boundaries:

// srow = 0 (starting row)

// erow = m - 1 (ending row)

// scol = 0 (starting column)

// ecol = n - 1 (ending column)

// tot = m × n (total elements)

// c = 0 (counter for visited elements)

// Loop until all elements are visited (c < tot):

// Traverse top row: left → right
// for i = scol to ecol → Arr[srow][i]
// Then do srow++ (top row is done).

// Traverse right column: top → bottom
// for i = srow to erow → Arr[i][ecol]
// Then do ecol-- (rightmost column is done).

// Traverse bottom row: right → left
// for i = ecol to scol → Arr[erow][i]
// Then do erow-- (bottom row is done).

// Traverse left column: bottom → top
// for i = erow to srow → Arr[i][scol]
// Then do scol++ (leftmost column is done).

// Repeat this process until all elements are added (c == tot).

// Dry Run Example

// Matrix =

// 1 2 3
// 4 5 6
// 7 8 9


// Top row → [1, 2, 3]

// Right col → [6, 9]

// Bottom row → [8, 7]

// Left col → [4]

// Middle → [5]

// Final output = [1, 2, 3, 6, 9, 8, 7, 4, 5]

// Time Complexity

// Each element is visited exactly once.

// Total elements = m × n.

// Therefore:

// 𝑇
// (
// 𝑛
// )
// =
// 𝑂
// (
// 𝑚
// ×
// 𝑛
// )
// T(n)=O(m×n)
// Space Complexity

// O(1) (ignoring output list).

// If we include the output list storing all elements, then O(m × n).

// Extra variables (srow, erow, scol, ecol, c) use constant space.

// ✅ Final Notes:

// The algorithm systematically shrinks the boundaries (srow, erow, scol, ecol) after each direction.

// The counter c ensures we don’t traverse extra elements when the matrix isn’t perfectly square.


