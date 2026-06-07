class Solution {
    Integer[] fibval = new Integer[31];
    {
        fibval[0] = 0;
        fibval[1] = 1; 
    }
    public int fib(int n) {
        if(fibval[n]!=null)
            return fibval[n];
        else
            return fib(n-2) + fib(n-1);
    }
}
