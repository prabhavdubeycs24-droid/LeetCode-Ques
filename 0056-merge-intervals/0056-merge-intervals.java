class Solution {
    public int[][] merge(int[][] arr) {
        List<ArrayList<Integer>> al  = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int i= 0 ; 
        int n = arr.length;
        while(i<n){
            int f = arr[i][0];
            int s = arr[i][1];
            if(i!=n-1 && arr[i][1]>=arr[i+1][0]){
                while(i<n-1 && s>=arr[i+1][0]){
                    s = Math.max(arr[i+1][1],s);
                    i++;
                }
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(f);
                temp.add(s);
                al.add(temp);
                i++;
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i][0]);
                temp.add(arr[i][1]);
                al.add(temp);
                i++;
            }
        }
        int a = al.size();
        int[][] ans = new int[a][2];
        for( i=0;i<a;i++){
            ans[i][0]=al.get(i).get(0);
            ans[i][1]=al.get(i).get(1);
        }
        return ans;
    }
}