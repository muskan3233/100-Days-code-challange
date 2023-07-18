// Quick Sort

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
    
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i = (low-1);
    
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
    
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
    
        int swapTemp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = swapTemp;
    
        return i+1;
    } 
}
// https://practice.geeksforgeeks.org/problems/quick-sort/1
