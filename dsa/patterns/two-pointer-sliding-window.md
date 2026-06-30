# Two Pointer / Sliding Window

## Core Concept
- 2 pointers (l, r) array/string pe range define karte hain
- 2 moves: **expand** (r++) aur **shrink** (l++)
- Har sliding window problem two pointer hai, but har two pointer problem sliding window nahi
  - Same direction pointers and continuous → sliding window
  - Opposite direction pointers → two pointer (non-window)

---

## Pattern: Constant Window (Type 1)

### When to use:
- Window size fix diya ho (e.g., "subarray of size k")
- Har window of size k pe koi condition check/track karni ho

### Template:
<!-- code baad me add karna -->

### Key decisions at each step:
1. Kya track karna hai across window? (sum, max, frequency map, etc.)
2. Window slide hone pe kya add (arr[r]) aur kya remove (arr[r-k]) karna hai?

### Problems solved:

---

## Pattern: Longest Subarray/Substring (Type 2)

### When to use:
- "Longest", "maximum length" subarray/substring jisme koi condition satisfy ho
- Expand karte raho jab tak valid, violate hone pe shrink karo

### Template:
<!-- code baad me add karna -->

### Key decisions at each step:
1. Condition kya hai jo violate hone pe shrink trigger karega? (sum > target, duplicate count > allowed, etc.)
2. State kaise track karoge? (variable, hashmap, frequency array)
3. Optimization chahiye? → `while` ki jagah `if` lagao, window kabhi shrink nahi hogi sirf slide hogi (jab sirf length chahiye, actual subarray nahi)

### Problems solved:

---

## Pattern: Count of Subarrays (Type 3)

### When to use:
- "Count subarrays" jisme something **exactly equals k**
- Directly count karna mushkil hota hai, trick use karo: `atMost(k) - atMost(k-1)`

### Template:
<!-- code baad me add karna -->

### Key decisions at each step:
1. Condition kya hai jo ≤ k me convert hogi?
2. Count kaise nikalta hai? → valid window [l...r] me r pe end hone wale subarrays = (r - l + 1), i.e., [l,r], [l+1,r], ... [r,r]

### Problems solved:

---

## Pattern: Smallest Subarray (Type 4)

### When to use:
- "Minimum length", "shortest" subarray jisme condition satisfy ho
- Expand till valid, then shrink while still valid, track minimum

### Template:
<!-- code baad me add karna -->

### Key decisions at each step:
1. Condition kya hai jo satisfy hone pe shrink trigger karega?
2. Key difference from Type 2: Type 2 me shrink on **violate** (maximize), yahan shrink on **satisfy** (minimize)

### Problems solved:

---

## Pattern: Opposite Direction Two Pointers (Type 5)

### When to use:
- Sorted array me pair find karna (two sum)
- Dono ends se compare karna (container with most water, palindrome)
- l = 0, r = end, converge karte hain

### Template:
<!-- code baad me add karna -->

### Key decisions at each step:
1. Kab l++ karna hai, kab r--? (depends on sorted order aur kya chahiye)
2. Kya dono pointers ek step move honge ya sirf ek? (usually ek, based on comparison)

### Problems solved:

---

## Quick Decision Guide

| Problem kehta hai... | Type |
|---|---|
| "subarray of size k" | Constant Window (1) |
| "longest/maximum length subarray where..." | Longest (2) |
| "count/number of subarrays where..." | Count = atMost trick (3) |
| "shortest/minimum length subarray where..." | Smallest (4) |
| "pair in sorted array", "two sum sorted" | Opposite Direction (5) |
