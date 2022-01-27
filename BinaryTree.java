//what is binary tree?
// a binary tree is a tree in which each node has at most two children.
//A tree in an undirected graph which satisfies any kind of the following definition:

// 1. An Acyclic Graph
// 2. A connected Graph with N nodes and N-1 edges
// 3. An graph in which any two vertices are connected by exactly one path

                    //       2              =====> root node
                    //     /   \
                    //    1     3           =====> child of a root node
                    //   / \    / \
                    //  4    8 4   5        ====> child of a child node
                    //       / \
                    //      7   9             ===========> leaf node


                    // what is  a subtree?
                    // a subtree is a tree which is a part of another tree.

//what is binary search tree?

// A binary Search tree is a binary tree that satisfies the bst invarient:
// 1. The left subtree of a node contains only nodes with keys less than the node's key.
// 2. The right subtree of a node contains only nodes with keys greater than the node's key.

                            //      8
                            //     /  \
                            //    4    12  
                            //   / \    / \  
                            //  3   6  9   13


//where are the BTs and BSTs USED?

// where are  binary trees usefull
    //1. implemention of some map and set ADT
    //2. Red Black Trees
    //3. AVL Trees
    //4. Splay Trees
    //5. Treap
    //6. Splay Trees
    //7. etc

    //used in implementation of binary heaps

    //syntax trees (used by compiler and calculators)

    // Treap - a probabilistic data structure (uses a randized BST)

//     ===========   Complexity analysis ===========


// ==================|==================|================|
// | OPERATION       |       AVERAGE    |         WORST  |
// |=====================================================|             
// |  Insertion      |       O(log n)   |          O(n)  |
// |=================|==================|================|
// |   Deletion      |      O(log n)    |         O(n)   |
// |=================|==================|================|
// |   Remove        |     O(log n)     |        O(n)    |
// |=================|==================|================|
// |   Find          |     O(log n)     |        O(n)    |
// |=================|==================| ===============|
// |   Contains      |      O(log n)    |         O(n)   |
// |=================|==================|================|
// |   Size          |      O(1)        |         O(1)   |
// |=================|==================|================|
// |   IsEmpty       |      O(1)        |         O(1)   |
// |=================|==================|================|
// |   Clear         |      O(n)        |         O(n)   |
// |=================|==================|================|
// |   ToArray       |      O(n)        |         O(n)   |
// |=================|==================|================|
// |   ToList        |      O(n)        |         O(n)   |
// |======================================================

// Binary tree elements must be comparable so that we can order them inside the tree

// when inserting AN ELEMENT we want to compare its value to the value store stored in the current node we are considering to decide on the following

// Recurse down left subtree             (< case)
//Recurse down right subtree             (> case)
//Hndle finding a dup value              (= case)
//Handle inserting a new node            (no case)


//insert(7)
//insert(5)
//insert(3)
//insert(2)
//insert(4)
//insert(6)
//insert(8)
//insert(9)
//insert(10)
//insert(11)

                        //          7                  =====>> RIGHT > ROOT > LEFT 
                        //         /  \ 
                        //        5    11        
                        //      / \    / \     
                        //     3   6  9   10
                        //     / \    \
                        //    2   4    8
