package Chapter17.SortListVia2Trees;

public class TreeNode
{
    private TreeNode left,right;
    private PersonNode value;

    public TreeNode(PersonNode node){
        this(node,null,null);
    }
    public TreeNode(PersonNode node, TreeNode left, TreeNode right) {
        this.value = node;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public PersonNode getValue() {
        return value;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setValue(PersonNode value) {
        this.value = value;
    }
}
