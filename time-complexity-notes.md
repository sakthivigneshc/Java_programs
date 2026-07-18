# Time Complexity Guide (Java) — When You Hit Each Big O

A quick way to *recognize* complexity: look at the **loops and how the input shrinks**, not the code length.

---

## O(1) — Constant Time
**When:** No loop, no recursion. Direct access (array index, HashMap get/put, arithmetic).

```java
int getFirst(int[] arr) {
    return arr[0];          // one operation, regardless of arr.length
}

boolean containsKey(HashMap<String, Integer> map, String key) {
    return map.containsKey(key); // O(1) average
}
```

---

## O(log n) — Logarithmic Time
**When:** Each step **cuts the input in half** (or by a constant factor). You never touch every element.

Common triggers:
- Binary search on a **sorted** array
- Balanced BST operations (insert/search/delete)
- Finding an element by repeatedly dividing the range

```java
int binarySearch(int[] arr, int target) {
    int lo = 0, hi = arr.length - 1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) lo = mid + 1;
        else hi = mid - 1;          // search space halves every iteration
    }
    return -1;
}
```
Why log n: with n=1000, you need only ~10 comparisons (2^10 ≈ 1000), not 1000.

---

## O(n) — Linear Time
**When:** You touch **every element exactly once** — a single pass, no nested loop.

```java
int findMax(int[] arr) {
    int max = arr[0];
    for (int num : arr) {          // one loop, n iterations
        if (num > max) max = num;
    }
    return max;
}

// HashMap-based single pass — still O(n)
boolean hasDuplicate(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    for (int num : arr) {
        if (!seen.add(num)) return true;
    }
    return false;
}
```

---

## O(n log n) — Linearithmic Time
**When:** You do a **log n operation, n times** — most commonly: efficient sorting, or a loop that calls binary search / a heap operation inside it.

Common triggers:
- Merge sort, quick sort (average), heap sort
- `Arrays.sort()`, `Collections.sort()` in Java (uses Dual-Pivot Quicksort / TimSort)
- Building a heap while processing n elements

```java
// Merge Sort — classic O(n log n)
void mergeSort(int[] arr, int left, int right) {
    if (left >= right) return;
    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);      // divides n -> log n levels
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);   // merging at each level costs O(n)
}
// n work per level * log n levels = O(n log n)

// Real-world use: sort then process
Arrays.sort(arr);                   // O(n log n)
```

---

## O(n²) — Quadratic Time
**When:** **Nested loop**, each running roughly n times — typically comparing every element with every other element.

```java
// Bubble sort / selection sort
void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {   // nested loop over n
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Brute-force pair check
boolean hasPairWithSum(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) return true;
        }
    }
    return false;
}
```

---

## O(2ⁿ) — Exponential Time
**When:** **Recursion that branches into 2 (or more) calls per step**, without caching results — every subproblem is recomputed.

```java
// Naive recursive Fibonacci — branches into 2 calls each time
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);   // 2 recursive calls, no memoization
}
```
Fix: add memoization → drops to O(n).

---

## O(n!) — Factorial Time
**When:** Generating **all permutations/orderings** of n items.

```java
void permute(List<Integer> nums, List<List<Integer>> result, List<Integer> current, boolean[] used) {
    if (current.size() == nums.size()) {
        result.add(new ArrayList<>(current));
        return;
    }
    for (int i = 0; i < nums.size(); i++) {
        if (used[i]) continue;
        used[i] = true;
        current.add(nums.get(i));
        permute(nums, result, current, used);   // n choices, then n-1, then n-2...
        current.remove(current.size() - 1);
        used[i] = false;
    }
}
```

---

## Quick Recognition Table

| Pattern in code | Complexity |
|---|---|
| No loop / direct access | O(1) |
| Loop that halves the range each time | O(log n) |
| Single loop over all elements | O(n) |
| Sorting, or loop + binary search/heap inside | O(n log n) |
| Two nested loops over same input | O(n²) |
| Three nested loops | O(n³) |
| Recursion branching in 2 without memoization | O(2ⁿ) |
| Generating all permutations | O(n!) |

**Rule of thumb while reading code:**
1. Count nested loops → each nested level over the *same* input roughly multiplies by n.
2. If the loop variable is *divided* (e.g. `i = i / 2` or `mid` search) → think log n.
3. If there's a sort call before/inside your logic, that alone sets a floor of O(n log n).
4. Recursion with 2+ branches per call and no memo table → suspect exponential.

---

## Which Complexities Matter Most for Interviews

Ranked by how often they actually come up and get discussed:

### 1. O(n) — the most expected "optimal" answer
Interviewers love asking "can you do it in one pass?" HashMap-based single-pass solutions (two-sum, frequency counting) are the go-to optimization from O(n²).

### 2. O(log n) — shows you understand binary search / trees
Comes up whenever the input is **sorted** or is a **BST**. If you brute-force a sorted-array problem in O(n), the interviewer's next question is almost always "can you do better since it's sorted?" — the answer is O(log n).

### 3. O(n log n) — the standard "sort first" optimization
Very common as the **expected final answer** for problems like: merge intervals, meeting rooms, closest pair, "sort then two-pointer." If you can't do O(n) or O(log n), O(n log n) is usually the fallback that interviewers still consider a good solution.

### 4. O(n²) — the brute-force baseline you must beat
Almost every problem starts here (nested loop / all-pairs). Interviewers expect you to state this first, then optimize it away using a HashMap, two-pointer, or sorting.

### 5. O(1) space vs O(1) time — often confused
Interviewers frequently care about **space complexity** separately (e.g., "can you do it in O(1) extra space?"), so be ready to discuss both time AND space for the same solution.

### 6. O(2ⁿ) / O(n!) — rarely the goal, but must be recognized
These show up in **recursion/backtracking** problems (subsets, permutations, combinations). You're not expected to optimize these away (they're often inherently exponential), but you ARE expected to recognize and state it, and know when **memoization/DP** can bring it down (e.g., 2ⁿ → n² or n via DP).

**Interview tip:** The typical flow interviewers want to see is:
`Brute force (state its complexity) → identify the bottleneck → optimize using HashMap/sorting/two-pointer/DP → state the new complexity (time AND space)`.
