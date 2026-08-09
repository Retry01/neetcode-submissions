class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(0,nums.length-1,nums);
        return nums;
    }
    public void mergesort(int left,int right,int[] arr){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        
        mergesort(left,mid,arr);
        mergesort(mid+1,right,arr);

        merge(left,mid,right,arr);
    }
    public void merge(int left,int mid,int right,int[] arr){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int i=0,j=0,k=left;
        int a[] = new int[n1];
        int b[] = new int[n2];

        System.arraycopy(arr,left,a,0,n1);
        System.arraycopy(arr,mid+1,b,0,n2);

        while(i<n1 && j<n2){
            if(a[i]<b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<n1) arr[k++] = a[i++];
        while(i<n2) arr[k++] = b[j++];
    }
}