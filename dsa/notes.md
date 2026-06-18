# DSA Fun Facts 🧠

---

## Complexity

- **Space complexity = max stack depth, total nodes nahi.**
  Recursion tree me total nodes = time complexity hoti hai. Lekin memory me ek time pe sirf ek path ke frames hote hain — baaki branches tab aate hain jab current path return kar chuka hota hai. Isiliye space = kitne frames ek saath stack pe hain = max depth.

- **Jab bhi halving ya doubling ho → O(log n) steps.**
  `n → n/2 → n/4 → ... → 1` — kitne steps? log₂(n). Yehi binary search, power of 2, aur string doubling me hota hai. Base change karne se (log₂ vs log₃) sirf constant factor badalta hai jo Big O me ignore hota hai — sab O(log n) hi hain.

- **Geometric series: `1 + 2 + 4 + ... + k/2 = k−1 = O(k)`**
  Jab inner loop har step pe double size ka ho (pehle 1, phir 2, phir 4...) toh seedha `O(iterations × k)` mat socho. Saare iterations ka sum nikalo — geometric series ka result hamesha O(k) aata hai, O(k log k) nahi.

- **Loop use karo recursion ki jagah → space O(log n) se O(1) ho jaata hai.**
  Recursion me har call ek stack frame banata hai — depth jitni, utna space. Wohi kaam iterative loop se karo toh koi stack frame nahi, sirf variables. Power of 3 recursion → O(log n) space. While loop wala → O(1) space.

- **Linear recursion (no branching) → Time O(n), Space O(n).**
  Har call ek kaam karti hai aur ek hi aage jaati hai. n calls = O(n) time. Saare n frames ek saath stack pe rehte hain jab tak base case nahi aata — isiliye space bhi O(n). Iterative loop se same kaam karo toh space O(1) ho jaata hai.
  
- **Branching recursion → Time O(b^d), Space O(depth).**
  Agar har call `b` recursive calls karti hai aur tree ki depth `d` hai toh total nodes = O(b^d) = time complexity. Space phir bhi sirf ek path ki height hai — left subtree complete hone ke baad uske frames pop ho jaate hain, tab right shuru hota hai. Dono branches ek saath stack pe nahi rehte.
  
- **Branching factor se space nahi badti, sirf time badti hai.**
  Chahe 2 branches hon ya 3 — space hamesha O(depth) rehti hai. Time exponential ho jaati hai (O(2^n), O(3^n)), space nahi.
  
---

## Recursion & Backtracking

- **2 branches (include/exclude) → Combinations. n branches (loop) → Permutations.**
  Include/exclude pattern me har element ke liye sirf 2 choices hain — lo ya chhodo. Ye combinations deta hai jahan order matter nahi karta. Permutations ke liye order matter karta hai, toh har position pe saare bache hue elements try karne padte hain — isliye loop chahiye, 2 branches se kaam nahi chalega.

- **Backtracking = Choose → Explore → Undo.**
  Kisi bhi backtracking solution me teen steps hote hain: ek choice karo (e.g. `freq[i]--`), us choice ke saath recursion karo, phir choice wapas lo (`freq[i]++`). Undo wala step hi ise sirf recursion se alag banata hai — bina undo ke ek hi path explore hoga, saare nahi.

- **Wide tree fixed depth → O(1) space. Linear chain → O(log n) space.**
  3-digit permutation tree bahut wide hai (n³ nodes) lekin sirf 3 levels deep hai — ek time pe max 3 stack frames. Power of 3 tree ek seedhi chain hai jitni log n deep — utne hi frames. Shape of tree determines space, size nahi.

---

## Java

- **`int[]` ko `Set` me daalo toh reference compare hota hai, content nahi.**
  Java me `int[]` ka `equals()` aur `hashCode()` memory address pe based hai. Toh `{1,2,3}` aur `{1,2,3}` do alag arrays hain Set ki nazar me — duplicates detect hi nahi honge. Fix: number bana ke `Set<Integer>` me daalo, ya `Arrays.toString()` se string banao.

- **`output.toString()` content nahi, memory address deta hai.**
  `int[]` pe `.toString()` call karo toh `[I@7852e922` jaisi string milegi — ye array ka type aur memory location hai. Actual content ke liye `Arrays.toString(output)` use karo jo `[1, 2, 3]` format deta hai.

- **`Arrays.sort()` void return karta hai — in-place sort hota hai.**
  `return Arrays.sort(arr)` likhoge toh compile error aayega kyunki sort kuch return nahi karta. Array khud hi sort ho jaata hai. Pehle `Arrays.sort(arr)` karo, phir `return arr` karo.

- **`Set<String>` slow hai, `Set<Integer>` use karo.**
  String hashing me har character process hoti hai — O(length) per operation. Integer hashing O(1) hai. Jab number store karna ho toh string mat banao, seedha int store karo.

- **`word[i]` Java me nahi hota — `word.charAt(i)` use karo.**
  Java me `String` ek object hai, array nahi. Index se character access karne ke liye `charAt(i)` method hai. Character ko int ki tarah use karna ho toh `(int) word.charAt(i)` ya `word.charAt(i) - 'a'` karo.

- **`str + char` ka result discard ho jaata hai — `StringBuilder.append()` use karo.**
  Java me `String` immutable hai. `str + char` ek nayi string banata hai lekin agar ushe variable me assign nahi kiya toh woh lost ho jaata hai. `StringBuilder` mutable hai — `.append()` directly same object me add karta hai, zyada efficient bhi hai.

- **`i++` — pehle value use hoti hai, phir increment.**
  `arr[i++] = val` matlab pehle `arr[i]` pe value assign hogi, phir `i` ek badhega. Ye ek clean trick hai jab loop me alag index variable track karna ho — `int i = 0` rakh aur `arr[i++]` use karo, alag `i++` line ki zaroorat nahi.

---

## Patterns

- **`freq[]` array use karo `used[]` boolean ki jagah jab duplicate elements ho.**
  `used[i] = true` sirf index track karta hai. Agar `digits = [1, 1, 2]` hai toh dono `1` ka index alag hai — ek use hone ke baad dusra `1` miss ho sakta hai ya dobara count ho sakta hai. `freq[digit]` value track karta hai — `freq[1] = 2` matlab do baar use kar sakte ho, decrement se automatically handle hota hai.

- **Backtracking me `clone()` ki jagah undo karo — ek hi array reuse hota hai.**
  `clone()` har recursive call pe nayi array banata hai — heap pe extra allocation, garbage collector pe load. Undo approach me ek hi array hai — value set karo, recurse karo, value wapas karo. Na extra memory, na extra allocation. `clone()` tab use karo jab undo karna genuinely mushkil ho.

---
