package Chapter17.SortListVia2Trees;

import Chapter17.Exercise.IntTreeNode;

import java.util.ArrayList;

public class SortTree {
    private TreeNode root;

    public SortTree(){
        this(null);
    }
    public SortTree(TreeNode root){
        this.root = root;
    }

    public TreeNode TreeSort(ArrayList<PersonNode> list)
    {
        return TreeSort(root,0,list.size()-1,list);
    }
    // postCondition: convert it into a balanced Binary Search Tree that has minimum possible height/
    private  TreeNode TreeSort(TreeNode root, int low, int high, ArrayList<PersonNode> list ){
        if(low <= high){
            int mid = (low + high) /2 ;
            root = new TreeNode(list.get(mid)); // cut it half
            root.setLeft(TreeSort(root.getLeft(), low,mid-1, list)); // left subtree
            root.setRight(TreeSort(root.getRight(),mid+1, high, list)); // right subtree
        }
        return root;
    }

    public void printID() {
        printID(root, 0);
    }
    private void printID(TreeNode root, int level) {
        if (root != null) {
            printID(root.getRight(), level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(" " + root.getValue().getIdNum());
            printID(root.getLeft(), level + 1);
        }
    }

    public void printInOrderID(){
        System.out.println("Natural order of printing ID:");
        printInOrderID(root);
        System.out.println();
    }

    private void printInOrderID(TreeNode root){
        if(root!=null){
            printInOrderID(root.getLeft());
            System.out.print(root.getValue().getIdNum() + " ");
            printInOrderID(root.getRight());
        }

    }

    public void printName() {
        printName(root, 0);
    }
    private void printName(TreeNode root, int level) {
        if (root != null) {
            printName(root.getRight(), level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(" " + root.getValue().getFullName());
            printName(root.getLeft(), level + 1);
        }
    }

    public void printNameInOrder(){
        System.out.println("Natural order of printing names:");
        printNameInOrder(root);
        System.out.println();
    }

    private void printNameInOrder(TreeNode root){
        if(root!=null){
            printNameInOrder(root.getLeft());
            System.out.print(root.getValue().getFullName() + " | ");
            printNameInOrder(root.getRight());
        }

    }
}
