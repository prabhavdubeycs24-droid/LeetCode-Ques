class pair implements Comparable<pair>{
    int count ; 
    int ele ; 
    pair(int count , int ele){
        this.count=count;
        this.ele=ele;
    }
    public int compareTo(pair p){
        return Integer.compare(this.count,p.count);
    }
}
class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<pair> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int j = arr[i];
            int count = 0;
            while(j!=0){
                if(j%2!=0){
                    count++;
                }
                j=j>>1;
            }
            al.add(new pair(count , arr[i]));
        }
        Collections.sort(al);
        int[] ans = new int[al.size()];
        for(int i=0;i<al.size();i++){
            pair p = al.get(i);
            ans[i]=p.ele;
        }
        return ans ; 
    }
}