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
