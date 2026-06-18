try recursive meathod too

## Iterative:
<!-- type of solution -->

### Intuition
Palindrome means that the first half and the second half reversed should match each other when traversing.

We can find the middle of the linked list using fast and slow pointer, if the slow pointer starts from head and fast starts from head, then middle for:
1. even length list would be length/2
2. odd length list would be length/2+1

After finding the middle, reverse from the middle pointer. 

Now traverse both the original first half and the reversed second half list and keep checking their values, they should match. The traversal will be till any of the both hit null. For odd length lists the first half will always have one extra number which is common to a pallindrome thats why we only traverse till any one hits null, because that extra node is irrelevant.

<!-- Describe your first thoughts on how to solve this problem. -->

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(N); 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(1); 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
