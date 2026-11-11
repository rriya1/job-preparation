# 231. Power of Two
[LeetCode](https://leetcode.com/problems/power-of-two/) · **Pattern:** Math · Recursion

**Key insight:** <!-- one line to remember this problem by -->

| Approach | Time | Space |
|----------|------|-------|
| [Iterative](Iterative.java) | O(log n) | O(1) |
| [Recursive](Recursive.java) | O(log n) | O(log n) |

**Remarks:**

IMP! STACK OVERFLLOW ERROR IN RECURSION
power++ is post-increment, it passes the current value of power and increments afterward. So the recursive call gets the same power value as the current call, causing infinite recursion.

---

## iterative:
<!-- type of solution -->

### Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

### Approach
<!-- Describe your approach to solving the problem. -->

### Complexity
- Time complexity: ; 
<!-- Add your time complexity here, e.g. $$O(n)$$ -->


- Space complexity: ; 
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
