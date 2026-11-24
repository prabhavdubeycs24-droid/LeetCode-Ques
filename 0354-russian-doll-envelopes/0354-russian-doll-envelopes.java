class Solution {
    public int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(b[1],a[1]);
            }
            else{
                return Integer.compare(a[0],b[0]);
            }
        });
        int[] height = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            height[i]=arr[i][1];
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(height[0]);
        for(int i=1;i<height.length;i++){
            if(height[i]>al.get(al.size()-1)){
                al.add(height[i]);
            }
            else{
                int l =0;
                int r = al.size()-1;
                while(l<r){
                    int mid = ((r-l)/2) + l  ;
                    if(al.get(mid)>=height[i]){
                        r = mid;
                    }
                    else{// mid < ith 
                        l = mid+1;
                    }
                }
                al.set(r,height[i]);
            }
        }
        return al.size();
    }
}