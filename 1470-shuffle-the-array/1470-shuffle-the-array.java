class Solution {
    public int[] shuffle(int[] arr, int n) {
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        for(int i=0;i<n;i++){
            n1[i]=arr[i];
            n2[i]=arr[i+n];
        }
        int i=0;
        int j = 0;
        int k =0;
        while(i<n && j<n){
            arr[k]=n1[i];
            arr[k+1]=n2[j];
            i++;
            j++;
            k=k+2;
        }
        return arr;
    }
}