class Solution {
    public boolean isPowerOfFour(int n) {
        return solve(n);
    }

    public boolean solve(int n){
        if(n<=0)
            return false;
        if(n==1)
            return true;    
        if(n%4==0)
            return solve(n/4);
        return false;
    }
}
