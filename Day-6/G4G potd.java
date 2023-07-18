// Smallest Positive missing number
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
         Arrays.sort(arr);
        int k = 1; 
     for(int i=0; i<=size-1; i++)  {
         if(arr[i] > 0) {
                if(arr[i] == k) {
                    k++;
                } else if(arr[i] < k) {
                    continue;
                } else {
                    return k;
     }
     }
     }
     return  k;
    }
}
// https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
