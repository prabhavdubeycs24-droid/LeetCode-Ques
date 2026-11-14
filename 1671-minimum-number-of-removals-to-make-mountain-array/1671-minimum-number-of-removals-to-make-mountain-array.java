class Solution {
    public int minimumMountainRemovals(int[] arr) {
        int n = arr.length;
        if(n<=2){
            return 0;
        }
        int[] LIS = new int[n];
        LIS[0]=1;
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=i;j>=0;j--){
                if(arr[i]>arr[j]){
                    max=Math.max(max,LIS[j]);
                }
            }
            LIS[i]=max+1;
        }
        int[] LDS = new int[n];
        LDS[n-1]=1;
        for(int i=n-2;i>=0;i--){
            int max = 0;
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    max=Math.max(max,LDS[j]);
                }
            }
            LDS[i]=max+1;
        }

        // max sum from LIS and LDS 
        int sum = 0 ; 
        for(int i=0;i<n;i++){
            if(LIS[i]>1 && LDS[i]>1){
                sum=Math.max(sum,LIS[i]+LDS[i]-1);
            }
        }
        return n-sum;
    }
}