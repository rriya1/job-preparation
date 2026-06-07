iterative solution gives a better space complexity in merging 2 sorted linked lists because in iteratove we perform all operations through one set of varibales while in recursive the same was achieved by constructing a call stack. 

iterative:
space complexity: o(1)
time complexity: o(m+n)

space reason: one set of variables used throughout.
time reason: traversal of both lists 


recursive:
space complexity: o(m+n)
time complexity: o(m+n)

space reason: a new call stack is created the number of times the recursive function was call i.e. for each node in the linked list.
time reason: number of times the recursive function was call i.e. for each node in the linked list and each function call takes o(1) time.
