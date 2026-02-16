# Progress Log

## Day 1
- Created repo structure
- Started with Banking exercise
- Learnt about variables, access modifiers, abtraction - classes and methods, encapsulation & invariants, constructors, interface, inheritance (extends) and polymorphism via override (@Override).

## Day 2
- Learnt about MVN test, surefire plugin and @Test classes and methods.
        mvn test → triggers Maven test phase
        Surefire scans src/test/java
        Runs classes named *Test
        JUnit runs methods marked with @Test

## Day 3
- Implemented stack (LIFO) using Linked List; learnt about final, static variables and classes. push/pop/peek O(1)
- Implemented queue (FIFO) using dynamic ArrayList; how does dynamic array grow. enqueue/dequeue/peek amortized O(1)

## Day 4
 - Implemented Linked List with option to add/remove elements from both ends. Overriden toString 
 - Complexity comparisons between Stack, Queue, LinkedList
 Operation              Array-Based (Stack/Queue)               Linked List 
 Push/Enqueue           O(1) (Amortized)                        O(1) 
 Pop/Dequeue            O(1)                                    O(1) 
 Search                 O(n)                                    O(n) 