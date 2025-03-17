**Hashing/Hashmap**

Hashing is a way to store data in key/value pair.

key    -   value
1      -   1
2      -   3
3      -   7

------------

int     -   string
--------------------
rollNo  -   names
137     -   Prabhu
731     -   Teja
317     -   Pamula

**note:** the value in every key will al ways be having the latest value available. In a way if there is a new value assigned, the value gets overridden.

in array architecture, key will be index and value would be 1,2,3,4,....

whenever there is any kind of search operation, we should always go with hashmap, since its has better optimized solution. It will drastically improve time complexity.

Instead of for loop use hashmap for searching. Looping thru an arrays costs, O(n) time complexity, where as its constant O(1) for hashing.      

**Time space trade-off:**
Refers to a compromise between the time complexity and space complexity of an algorithm.
    * If speed is more important, you may use extra memory to store precomputed results.
    * If memory is limited, you may choose to recompute values, increasing execution time.



time complexity: O(1)
space complexity: O(n)