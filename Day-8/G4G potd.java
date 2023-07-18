// Find kth element of spiral matrix
class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
// Your code here
int row=0,col=0,rowE=n-1,colE=m-1;
 
while(row<=rowE && col<=colE){
    for(int i=col;i<=colE;i++){
        k-=1;
        if(k==0)return A[row][i];
    }
    row+=1;
    for(int i=row;i<=rowE;i++){
        k-=1;
        if(k==0)return A[i][colE];
    }
    colE-=1;
    for(int i=colE;i>=col;i--){
        k-=1;
        if(k==0)return A[rowE][i];
        
    }
    rowE-=1;
    for(int i=rowE;i>=row;i--){
        k-=1;
        if(k==0)return A[i][col];
    }
    col+=1;
}
return -1;
 
  }
}
// https://practice.geeksforgeeks.org/problems/find-nth-element-of-spiral-matrix/1
