/*
Runtime 1 ms Beats 96.47%
Memory 42.70 MB Beats 17.88%
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        boolean ans = false;
        while(Math.pow(2,i) <= n ){
            if(Math.pow(2,i)== n)
                ans = true;
            i++;    
        }
        return ans;
    }
}
