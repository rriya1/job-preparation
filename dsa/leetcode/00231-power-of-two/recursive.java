/*
  Runtime 1 ms Beats 96.47%
  Memory 42.48 MB Beats 71.25%
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n%2!=0)
            return false;
        return powpow(n, 1);    
    }

    public boolean powpow(int n, int power){
        double val = Math.pow(2,power);
        if(val>n)
            return false;
        return val == n ? true : powpow(n, ++power);
    }
}
