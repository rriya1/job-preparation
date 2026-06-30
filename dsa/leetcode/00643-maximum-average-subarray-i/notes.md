<!-- any brief remarks -->

## Constant Window:
<!-- type of solution -->

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
as K is fixed in the problem with a given condition that these k elements must achieve, this is a constant-window problem. kabhi bhi ek time pe k number of elements pe calculation karna h.

### Approach
<!-- Describe your approach to solving the problem. -->
first define left = 0 and right = k-1 in constant window problems, calculate on the first window, then loop use krke calculation krte raho till right<length-1.

Lenght -1 iss liye rakhna h because while we calulate ham left++ krte rehte h and usko use krte h and ++right krke use krte h. matlab right ko first increment krte h then usko use krte h. So right ekbaari jab length-1 index i.e. last index of array tak increment hojaega uske baad hamko use while loop ke check se loop se bahar nikal dena h else the index will become out of bounds.

### Complexity
- Time complexity: o(n) ; going through the whole array only once using pointers. 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(1) ; only calculation varibales used, baaki everything is calculated on the way.  
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
