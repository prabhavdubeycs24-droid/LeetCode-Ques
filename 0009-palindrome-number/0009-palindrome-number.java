class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        //if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE){// useless ,imp when x is not int 
          //  return false;
        //}
        int rev = 0;
        int original = x ; 
        while(x>rev){
            int pop = x%10;
            rev= rev*10+pop;
            x=x/10;
        } 
        if(x==rev || x==rev/10){
            return true ;
        }
        return false ; 
    }
}