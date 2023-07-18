// Count the subarrays having product less than k

class Solution {    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long prod = 1;
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j=i;j<n;j++){
                prod = prod * a[j];
                if(prod<k){
                    cnt++;
                }else{
                    break;
                }
                
            }
            prod = 1;
        }
        return cnt;
    }
}

// https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1
