package Chapter17.Exercise;

public class BinarySearchTree
{
    private IntTreeNode overallRoot;

    public BinarySearchTree(){
        overallRoot = null;
    }
    public BinarySearchTree(int[] array){
        for(int i = 0; i< array.length;i++){
            add(array[i]);
        }
    }

    public void add(int value){
        overallRoot = add(overallRoot,value);
    }

    public IntTreeNode add(IntTreeNode root, int value){
        if(root == null){
            root = new IntTreeNode(value);
        }else if(value <= root.data){ // left subtree
            root.left = add(root.left,value);
        }else{ // value > root.data      right subtree
            root.right = add(root.right,value);
        }
        return root;
    }

    public boolean contains(int value){
        return contains(overallRoot,value);
    }

    public boolean contains(IntTreeNode root, int value){
        if(root == null){ // empty root
            return false;
        }else if(root.data == value){ // Found it
            return true;
        }else if(value < root.data){ // left subtree
            return contains(root.left,value);
        }else{ //value > root.data
            return contains(root.right,value);
        }
    }

    public void print(){
        printInOrder(overallRoot);
        System.out.println();
    }

    private void printInOrder(IntTreeNode root){
        if(root!= null){
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }
    }

    public void printSideWays() {
        printSideWays(overallRoot, 0);
    }
    // post: prints in reversed preorder the tree with given
    // root, indenting each line to the given level

    private void printSideWays(IntTreeNode root, int level) {
        if (root != null) {
            printSideWays(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(" " + root.data);
            printSideWays(root.left, level + 1);
        }
    }

    public int min(){
        if(overallRoot == null){throw new IllegalStateException();}
        return min(overallRoot);
    }
    private int min(IntTreeNode root){
        if(root.left == null)
            return root.data;
        else // keep researching
            return min(root.left);
    }
    public int max(){
        if(overallRoot == null){throw new IllegalStateException();}
        return max(overallRoot);
    }
    private int max(IntTreeNode root){
        if(root.right == null)
            return root.data;
        else // keep researching
            return min(root.right);
    }

}
