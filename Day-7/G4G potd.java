// Transpose of Matrix
class Solution
{
    public void transpose(int n,int a[][])
    {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements across the diagonal
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
// https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
