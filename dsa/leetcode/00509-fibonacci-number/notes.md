# 509. Fibonacci Number
[LeetCode](https://leetcode.com/problems/fibonacci-number/) · **Pattern:** Recursion · DP (Memoization)

**Key insight:** <!-- one line to remember this problem by -->

| Approach | Time | Space |
|----------|------|-------|
| [Recursive](Recursive.java) | O(2^n) | O(n) |
| [Memoization](Memoization.java) | O(n) intended, O(2^n) as written | O(n) |

**Remarks:**

couldn't think of recursion through decisions and choices here. 
There is no choices and decisions to make here, only a given formula to apply hence recusrion tree will not work here. Try to utilize DP1 to save time as fibonacci recuires calculation of same f(n) multiple times.

- [ ] find intution to think of recursive method through choices and decesions.

- [ ] Memoization.java never saves the result (`fibval[n] = ...` is missing), so it still recomputes everything. Once the result is cached, time drops to O(n).
