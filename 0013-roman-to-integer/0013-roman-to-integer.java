class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int x = 0;
            
            char c = s.charAt(i);
            if(c=='I'){
                x=1;
            }
            if(c=='V'){
                x=5;
            }
            if(c=='X'){
                x=10;
            }
            if(c=='L'){
                x=50;
            }
            if(c=='C'){
                x=100;
            }
            if(c=='D'){
                x=500;
            }
            if(c=='M'){
                x=1000;
            }
            int next = 0;
            if(i < s.length()-1){
            char d = s.charAt(i+1);
            
            if(d=='I') next=1;
            if(d=='V') next=5;
            if(d=='X') next=10;
            if(d=='L') next=50;
            if(d=='C') next=100;
            if(d=='D') next=500;
            if(d=='M') next=1000;
            }
            if(x >= next){
                ans=ans+x;
            }
            else{
                ans=ans-x;
            }
        }
        return ans ; 
    }
}