Iterative solution gives a better space complexity in merging 2 sorted linked lists because in iteratove we perform all operations through one set of varibales while in recursive the same was achieved by constructing a call stack. 

## iterative:

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Came to the conslcusion after primitively thinking about pointers, 
maintain one current pointer, one previous pointer and a head pointer for both lists. 

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(m+n); traversal of both lists 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(1); one set of variables used throughout.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


## recursive:

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Came to the conslcusion after primitively thinking about pointers, 
maintain one current pointer, one previous pointer and a head pointer for both lists. 

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(m+n); number of times the recursive function was call i.e. for each node in the linked list and each function call takes o(1) time.

<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: o(m+n); a new call stack is created the number of times the recursive function was call i.e. for each node in the linked list.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
