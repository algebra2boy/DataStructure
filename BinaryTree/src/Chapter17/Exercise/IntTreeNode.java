package Chapter17.Exercise;

// ==========================================================

// Class for storing a single node of a binary tree of ints
// BJP 3rd Edition pg 1020-1023


public class IntTreeNode
{
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    // constructs a leaf node with given data
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public IntTreeNode(int data){
        this(data,null,null);
    }

    public void setLeft(IntTreeNode left){
        this.left = left;
    }
    public void setRight(IntTreeNode right){
        this.right = right;
    }

}
// ================================================================
// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder, or postorder traversal. The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree. The
// documentation refers to these as "sequential trees."
// BJP 3rd Edition pg 1020-1023
