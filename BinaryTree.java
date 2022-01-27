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
                            //   / \   / \  
                            //  3   6 9   13


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


//Removing element fro ma binary search tree

// its a two step proccess

//1. find the element we want to remove
// Relace the node we want to remove  with its successor to maintain the bst invariant

//recall the bst invariant: left subtree has a smaller value than the root and the right subtree has a larger value than the root


//find Phase
//1.We hit the null node at the point we know the value is not in the tree
//2. comparator value equal to 0-- we found it
//3. comparator value less than 0-- we recurse down the left subtree
//4. comparator value greater than 0-- we recurse down the right subtree


//remove Phase
//1. node to remove is a leaf node
//2. node to remove has a right subtree but no left subtree
//3. node we want to remove has a left subtree but no right subtree
//4. node to remove has both a left and right subtree


// ok lets write some codees

public class BinaryTree<T extends comparable<T>> 
{
    // Tracks the number of the nodes in bst
    private int nodeCount = 0;

    //this is a rooted tree so we have a root node
    private Node root = null;

    private class Node{
        T data;
        Node left;
        Node right;

        public Node(Node left, Node right, T elem){
            this.data = elem;
            this.left = null;
            this.right = null;
        }
    }

    // check if binary tree is empty
    public boolean isEmpty(){
        return size() == 0;
    }

    // return the number of nodes in the binary tree
    public int size(){
        return nodeCount;
    }

    // insert a new node into the binary tree
public boolean add(T elem)
{
    if(contains(elem))
    {
        return false;
    }
    else
    {
        root = add(root, elem);
        nodeCount++;
        return true;
    }

    private Node add(Node node, T elem)
    {
        //base case
        if(node == null)
        {
            node = new Node(null, null, elem);
        }
        else
        {
            int comp = elem.compareTo(node.data);
            if(comp < 0)
            {
                node.left = add(node.left, elem);
            }
            else if(comp > 0)
            {
                node.right = add(node.right, elem);
            }
        }
    }

    // remove a node from the binary tree
    public boolean remove(T elem)
    {
        if(!contains(elem))
        {
            return false;
        }
        else
        {
            root = remove(root, elem);
            nodeCount--;
            return true;
        }
    }


//recursive helper method
    private Node remove(Node node, T elem)
    {
        if(node == null) return null;

        int comp = elem.compareTo(node.data);

        if(cmp < 0)
        {
            node.left = remove(node.left, elem);
        }
            else if(cmp > 0)
        {
            node.right = remove(node.right, elem);
        }

        else{
            //node to remove has both left and right subtree
            if(node.left == null)
            {
                Node rightchild = node.right;

                node = null;
                node.data = null;

                return rightchild;
            }
            else if(node.right == null)
            {
                Node leftchild = node.left;

                node = null;
                node.data = null;

                return leftchild;
            }
            else
            {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = remove(node.right, successor.data);


            }


        }

        return node;



        //base case

    }

    private Node getSuccessor(Node node)
    {
        Node successor = null;
        Node current = node.right;

        while(current != null)
        {
            successor = current;
            current = current.left;
        }

        return successor;
    }

private boolean contains(Node node, T elem)
{
    if(node == null)
    {
        return false;
    }
    else
    {
        int comp = elem.compareTo(node.data);
        if(comp < 0)
        {
            return contains(node.left, elem);
        }
        else if(comp > 0)
        {
            return contains(node.right, elem);
        }
        else
        {
            return true;
        }
    }
}



}



}