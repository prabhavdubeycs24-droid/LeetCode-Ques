class Solution {

    public int countHillValley(int[] arr) {
        int count = 0 ;
        ArrayList<Integer> demo = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i!=0 && demo.get(demo.size()-1)==arr[i]){
                continue;
            }
            demo.add(arr[i]);
        }
        for(int i=1;i<demo.size()-1;i++){
            if(demo.get(i)>demo.get(i+1) && demo.get(i)>demo.get(i-1)){
                count++;
            }
            if(demo.get(i)<demo.get(i+1) && demo.get(i)<demo.get(i-1)){
                count++;
            }
        }
        return count ; 
    }
}