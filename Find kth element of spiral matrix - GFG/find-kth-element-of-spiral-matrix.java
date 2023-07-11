//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution {
    int findK(int A[][], int n, int m, int k) {
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        int count = 0;

        while (count < k && rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse top row from left to right
            for (int i = colStart; i <= colEnd && count < k; i++) {
                count++;
                if (count == k)
                    return A[rowStart][i];
            }
            rowStart++;

            // Traverse right column from top to bottom
            for (int i = rowStart; i <= rowEnd && count < k; i++) {
                count++;
                if (count == k)
                    return A[i][colEnd];
            }
            colEnd--;

            // Traverse bottom row from right to left
            for (int i = colEnd; i >= colStart && count < k; i--) {
                count++;
                if (count == k)
                    return A[rowEnd][i];
            }
            rowEnd--;

            // Traverse left column from bottom to top
            for (int i = rowEnd; i >= rowStart && count < k; i--) {
                count++;
                if (count == k)
                    return A[i][colStart];
            }
            colStart++;
        }

        return -1; // Element does not exist for given k
    }
}


