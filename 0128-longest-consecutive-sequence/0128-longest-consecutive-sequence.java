class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0 ;
        }
        if(arr.length==1){
            return 1 ; 
        }
        int max = 1;
        Arrays.sort(arr);
        int i =0;
        while(i<arr.length-1){
            int count = 1;
            if(arr[i]+1==arr[i+1] || arr[i]==arr[i+1]){
                while(i<arr.length-1 && (arr[i]+1==arr[i+1] || arr[i]==arr[i+1]) ){
                    if(arr[i]==arr[i+1]){
                        i++;
                    }
                    else{
                        i++;
                        count++;
                    }
                }
                if(count>max){
                    max = count ; 
                }
            }
            i++;
        }
        return max ; 
    }
}