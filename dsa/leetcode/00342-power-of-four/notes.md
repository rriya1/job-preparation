<!-- any brief remarks -->
- [ ] how to do it without recursion and loops?

## Recursive:
<!-- type of solution -->

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Any number which is a power of 4 will be divisible by 4 hence the modulo will be 0, and then we'll do n/4 to get to the next number, which also needs to be divisible by 4 to make it a power of 4...we keep doing this till we get to 1 because 4/4=1 and 4^0=1.

But 0 and any negative number can never a power of 4, so this should be the first check every time.

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(log n); complexity will be the number of times the recursive function is called i.e. n, n/4, n/16..... which is log base 4 n 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(log n); complexity will the number of times the stack has a frame, i.e. the number of times the recursive function is called i.e. n, n/4, n/16..... which is log base 4 n   
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
