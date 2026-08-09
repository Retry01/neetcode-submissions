class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums);        
    }
    public int[] mergesort(int arr[]){
        int i=0;
        int j = arr.length-1;
        if(i>=j) return arr;
        int mid = i+(j-i)/2;
        int n1 = mid-i+1;
        int n2 = j-mid;
        int[] a = new int[n1];
        int[] b = new int[n2];
        System.arraycopy(arr,i,a,0,n1);
        System.arraycopy(arr,mid+1,b,0,n2);
        return merge(mergesort(a),mergesort (b));

    }
    public int[] merge(int[] a,int[] b){
        int i=0,j=0,k=0;
        int size = a.length+b.length;
        int[] f = new int[size];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) f[k++] = a[i++];
            else f[k++] = b[j++];
        }
        while(i<a.length) f[k++] = a[i++];
        while(j<b.length) f[k++] = b[j++];
        return f;
    }
}