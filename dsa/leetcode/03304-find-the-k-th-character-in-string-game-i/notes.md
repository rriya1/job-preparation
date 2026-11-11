# 3304. Find the K-th Character in String Game I
[LeetCode](https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/) · **Pattern:** Simulation

**Key insight:** <!-- one line to remember this problem by -->

| Approach | Time | Space |
|----------|------|-------|
| [Iterative](Iterative.java) | O(k) | O(k) |

**Remarks:**

- [ ] Time is O(k), not O(log k): there are log k doublings, but the string length doubles each time, so total work is 1 + 2 + 4 + … ≈ 2k = O(k) (the geometric series fact in `dsa/notes.md`).

---

## Iterative:
<!-- type of solution -->

### Intuition
Basic approach of just looping over till we hit a length of k, till then keep adding "word" + "negative of word".
This leads to a very bad time complexity and space complexity.
agar k bahut bada ho (is problem me k up to 500 hai toh fine!) toh memory issue ho sakta hai.
<!-- Describe your first thoughts on how to solve this problem. -->

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: o(log k); 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: ; 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
