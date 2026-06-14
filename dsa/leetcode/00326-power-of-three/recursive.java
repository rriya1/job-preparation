class Solution {
    public boolean isPowerOfThree(int n) {
        return solve(n);
    }

    public boolean solve(int n){
        if(n<=0)
            return false;   
        if(n == 1)
            return true;
        if(n%3 == 0)
            return solve(n/3); 
        return false;    
    }
}
