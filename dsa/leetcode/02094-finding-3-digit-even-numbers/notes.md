<!-- any brief remarks -->
- [ ] Explore backtracking frequency method for more optemised solution.
- [ ] In recusrion solution, try to reduce the number of iteration of repeating numbers. if a number haas already been used in a call at the same index and it repeats in the input array then how can we save this information and avoid a redundant call?

## Recursive:
<!-- type of solution -->

### Intuition
same solution as 03483 but instead of adding it to a set to calculate it's length, we are returning the values too.
values are stores in a set of int this time by calculating the number itself, we cannot use a set of string here as a set of string gets stored like this: eg - 203 will be stored as [2,0,3].
<!-- Describe your first thoughts on how to solve this problem. -->

### Approach
<!-- Describe your approach to solving the problem. -->
same approach as 03483

### Complexity
- Time complexity: o(n^3) but o(1) for 3 digit only ; calculate the depth of the redursion tree 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(n) or o(1) for 3 digit only ; number of stacks active at a time
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
