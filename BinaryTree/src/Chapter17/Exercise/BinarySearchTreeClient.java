package Chapter17.Exercise;

public class BinarySearchTreeClient {
    public static void main(String[] args){
        int[] array = {85, 3, -90, 12, 124, 1, 24, 55, -12,0};
        BinarySearchTree tree = new BinarySearchTree(array);
        tree.printSideWays();
        System.out.println("tree.min():"+tree.min());
        System.out.println("tree.max():"+tree.max());
    }
}
