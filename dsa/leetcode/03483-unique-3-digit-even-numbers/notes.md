<!-- any brief remarks -->

## Recusive:
<!-- type of solution -->

### Intuition
the decision here is to either take a number from the ditils array for a given index, or not and this will be done for each of the 3 indexes. 
So removing the even number and 0 at the beggining constraints of the question, a very basic choice of digits would be 9*8*7 as repetition is not allowed.
we can add the question constraints with a simple if block.

The decision tree will have digits.length branches at the first depth.
the decision tree will have digits.length-1 branches at the second depth.
the decision tree will have digits.length-2 branches at the third depth.

only 3 depths will be there because after the 3rd breadth the output array will comprise of 3 digits.
so total iterations is (digits.length)(digits.length-1)(digits.length-2) which is o(n^3).
but due to the small size of the digits array, ie, 9 we can assume it to be 9*8*7 which is a very small number hence o(1)


### Approach
Recursive function which takes input array, an output array, index of the output array which we are at, a used array to tell whcih indexes have been utilized and a set to carry the final answers.
Then inside the function we will iterate the whole digits array while checked the "used" array for used digits of input, if not used then use it for the current index.
This way each unused digit gets a chance to be placed at the current index.
and then we call the recursive function on this new output, hence all number get a chance to be at index and in the next iteration, all ununsed numbers again get a chance to be at the index+1 position.

<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(1); so total iterations is (digits.length)(digits.length-1)(digits.length-2) which is o(n^3), but due to the small size of the digits array, ie, 9 we can assume it to be 9*8*7 which is a very small number hence o(1)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(1) ; only 3 stacks in the frame at once. space complexity stack depth pe depend karti hai, total nodes pe nahi.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

## Backtracking:
<!-- type of solution -->

### Intuition
Everything is same as recursion, the only difference is that instead of using a new "used" array which helps to check if digit it used or not, we first make the digit used, then call the recusrsive function passing the changed "used" into it, then after the function returns we need to change the "used" array's index to ununsed.
So we are first making the change for temporary basis only to make the recusive function aware of it, then backtracking(reverting) to our original formation of "used" which will be passed in the next loop.

### Approach
before calling the recursive function change the used array, call the recursive function then revert to the original used array after the function returns.

<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(1); so total iterations is (digits.length)(digits.length-1)(digits.length-2) which is o(n^3), but due to the small size of the digits array, ie, 9 we can assume it to be 9*8*7 which is a very small number hence o(1)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: o(1) ; only 3 stacks in the frame at once. space complexity stack depth pe depend karti hai, total nodes pe nahi.

