<!-- any brief remarks -->

## Recursive:
<!-- type of solution -->

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Think of what choice you have to take one step at a time. The choice here is to pick one node at a time and make it the head of the new reversed list. Reversing matlab jo peeche tha wo new head ho jaega and jo aage tha wo new tail.
So the approach boils down to, start from the front of the current input, pick that node and place it in output's head. once the input is finished i.e. null, there's nothing to reverse.

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(n); the function gets called n times and each iteration takes o(1) time 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(n); at the base condition, n frames exist in the recursion stack at once. 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

---

## Iterative:
<!-- type of solution -->

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
recursive waale tarike ko while loop me likho.

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(n); the function gets called n times and each iteration takes o(1) time 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(1); all variables take one space only.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

