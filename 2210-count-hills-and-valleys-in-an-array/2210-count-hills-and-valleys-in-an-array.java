class Solution {
    public int countHillValley(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        int i = 1 ;
        while(i<arr.length){
            if(arr[i]==al.get(al.size()-1)){
                i++;
            }
            else{
                al.add(arr[i]);
                i++;
            }
        }
        int count = 0 ; 
        for(i=1;i<al.size()-1;i++){
            if((al.get(i)>al.get(i+1)&&al.get(i)>al.get(i-1)) ||(al.get(i)<al.get(i+1) && al.get(i)<al.get(i-1))){
                count++;
            }
        }
        return count;

    }
}