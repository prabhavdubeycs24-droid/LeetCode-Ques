class pair implements Comparable<pair>{
    int count ; 
    int ele ; 
    pair(int count , int ele){
        this.count=count;
        this.ele=ele;
    }
    public int compareTo(pair p){
        int s =  Integer.compare(this.count,p.count);
        if(s==0){
            return Integer.compare(this.ele,p.ele);
        }
        return s ; 
    }
}
class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<pair> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new pair(Integer.bitCount(arr[i]) , arr[i]));
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