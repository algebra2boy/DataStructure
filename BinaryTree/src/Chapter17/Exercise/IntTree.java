package Chapter17.Exercise;

import java.util.ArrayList;

public class IntTree {
    private IntTreeNode overallRoot;

    //// SelfChecks

    public IntTree(IntTreeNode root) {
        overallRoot = root;
    }

    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max is less than zero");
        }
        overallRoot = builtTree(1, max);
    }

    public IntTreeNode getOverallRoot() {
        return overallRoot;
    }

    // post: returns a sequential tree with n as its root unless
    // n is greater than max, in which case it returns an
    // empty tree
    public IntTreeNode builtTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, builtTree(2 * n, max), builtTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreOrder() {
        System.out.print("preorder:");
        printPreOrder(overallRoot);
        System.out.println();
    }

    // post: prints in preorder the tree with given root
    private void printPreOrder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    // post: prints the tree contents using an inorder traversal
    public void printInOrder() {
        System.out.print("inorder:");
        printInOrder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInOrder(IntTreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(" " + root.data);
            printInOrder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostOrder() {
        System.out.print("postorder:");
        printPostOrder(overallRoot);
        System.out.println();

    }

    // post: prints in postorder the tree with given root
    private void printPostOrder(IntTreeNode root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    // inorder traversal and using indentation to indicate
    // node depth; prints right to left so that it looks
    // correct when the output is rotated.
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

    public void printMirror() {
        System.out.print("printMirror:");
        printMirror(overallRoot);
        System.out.println();
    }

    private void printMirror(IntTreeNode root) {
        if (root != null) {
            printMirror(root.right);
            System.out.print(" " + root.data);
            printMirror(root.left);
        }
    }

    public int sum() {
        return sum(overallRoot);
    }

    private int sum(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.data + sum(root.left) + sum(root.right);
        }
    }

    public int countLeaves() {
        return countLeaves(overallRoot);
    }

    private int countLeaves(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeaves(root.left) + countLeaves(root.right);
        }
    }

    public int countLevels() {
        return countLevels(overallRoot);
    }

    private int countLevels(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(countLevels(root.left), countLevels(root.right));
        }
    }

    public int size() {
        return size(overallRoot);
    }

    private int size(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else
            return 1 + size(root.left) + size(root.right);
    }

    public int countBranchesAnotherMethod() {
        return size() - countLeaves();
    }

    public int countBranches() {
        return countBranches(overallRoot);
    }

    private int countBranches(IntTreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        } else {
            return 1 + countBranches(root.left) + countBranches(root.right);
        }
    }

    // SelfChecks

    // Exercises
    public void printLeftNodes() {
        printLeftNodes(overallRoot);
    }

    private void printLeftNodes(IntTreeNode root) {
        if (root != null && root.left != null) {
            System.out.print(root.left.data + " ");
            printLeftNodes(root.left);
            printLeftNodes(root.right);
        }
    }

    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countLeftNodes(IntTreeNode root) {
        if (root == null || root.left == null) {
            return 0;
        } else {
            return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
        }
    }

    public int depthSum() {
        return depthSum(overallRoot, 1);
    }

    private int depthSum(IntTreeNode root, int level) {
        if (root == null) {
            return 0;
        } else {
            return level * root.data +
                    depthSum(root.left, level + 1) +
                    depthSum(root.right, level + 1);
        }
    }

    public void printLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("level is less than 1");
        }
        printLevel(overallRoot, 1, level);
    }

    private void printLevel(IntTreeNode root, int start, int level) {
        if (root != null) {
            if(start < level) {
                printLevel(root.left, start + 1, level);
                printLevel(root.right, start + 1, level);
            }else if (start == level) {
                System.out.println(root.data);
            }
        }
    }

    public void printLeaves() {
        if (overallRoot == null) {
            System.out.println("no leaves");
        } else {
            System.out.print("leaves: ");
            printLeaves(overallRoot);
        }
    }

    private void printLeaves(IntTreeNode root) {
        if (root == null) {
            System.out.print("");
        } else if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        } else { // recursion
            printLeaves(root.right);
            printLeaves(root.left);
        }
    }


    public int countEvenBranches() {
        return countEvenBranches(overallRoot);
    }

    private int countEvenBranches(IntTreeNode root) {
        if (((root == null) || (root.left == null && root.right == null))) {
            return 0;
        } else {
            if (root.data % 2 != 0) { // root is odd
                return countEvenBranches(root.left) + countEvenBranches(root.right);
            } else { // root is even
                return 1;
            }
        }
    }

    public void printEvenBranches() {
        printEvenBranches(overallRoot);
        System.out.println();
    }

    private void printEvenBranches(IntTreeNode root) {
        if (root != null && root.left != null && root.right != null) {
            if (root.data % 2 == 0) {
                System.out.print(root.data + " ");
            }
            printEvenBranches(root.left);
            printEvenBranches(root.right);
        }
    }

    public void countEmpty() {
        System.out.println("there are " + countEmpty(overallRoot) + " empty branches");
    }

    private int countEmpty(IntTreeNode root) {
        if (root == null) {
            return 1;
        } else return 0 + countEmpty(root.left) + countEmpty(root.right);
    }

    public void doublePositives() {
        System.out.println("Tree after double all data values");
        doublePositives(overallRoot);
    }

    private void doublePositives(IntTreeNode root) {
        if (root != null) {
            if (root.data > 0) {
                root.data = root.data * 2;
            }
            doublePositives(root.left);
            doublePositives(root.right);
        }
    }

    public boolean equals(IntTreeNode t1, IntTreeNode t2) {
        if (t1 == null && t2 == null) { // both nodes are empty
            return true;
        } else if (t1 != null && t2 != null) { // both nodes are non-empty
            return t1.data == t2.data && equals(t1.left, t2.left) && equals(t1.right, t2.right);
        }
        return false; // one is empty, another is not
    }

    public boolean isFull() {
        return isFull(overallRoot);
    }

    private boolean isFull(IntTreeNode root) {
        if (root == null) {
            return true;
        } else if (root != null) {
            return ((root.left == null && root.right == null) || // 0 child
                    (root.left != null && root.right != null)) &&  // 2 children
                    isFull(root.left) && isFull(root.right);
        }
        return false;
    }

    public int numberNodes() {
        return numberNodes(overallRoot, 1);
    }

    private int numberNodes(IntTreeNode root, int run) {
        if (root == null) {
            return 0;
        } else { // root!= null
            root.data = run;
            int left = numberNodes(root.left, run + 1); // each time inc by 1
            int right = numberNodes(root.right, run + left + 1);
            return 1 + left + right; // add the # of nodes from left and right
        }
    }

    public int min() {
        if (overallRoot == null) {
            throw new IllegalStateException();
        }
        return min(overallRoot);
    }

    private int min(IntTreeNode root) {
        if (root.left == null && root.right == null) { //  has only one node or leaf node
            return root.data;
        } else { //branch node
            int min = root.data; // first data
            if (root.left != null && min > min(root.left)) { // left subtree
                min = min(root.left);
            }
            if (root.right != null && min > min(root.right)) { // right subtree
                min = min(root.right);
            }
            return min;
        }
    }

    public int max() {
        if (overallRoot == null) {
            throw new IllegalStateException();
        }
        return max(overallRoot);
    }

    private int max(IntTreeNode root) {
        if (root.left == null && root.right == null) { //  has only one node or leaf node
            return root.data;
        } else { //branch node
            int max = root.data; // first data
            if (root.left != null && max < max(root.left)) { // left subtree
                max = max(root.left);
            }
            if (root.right != null && max < max(root.right)) { // right subtree
                max = max(root.right);
            }
            return max;
        }
    }

    // #12 - 20

    public void removeLeaves() {
        overallRoot = removeLeaves(overallRoot);
    }

    private IntTreeNode removeLeaves(IntTreeNode root) {
        if (root == null) {
            return root;
        } // if the tree is empty
        else {
            if (root.left == null && root.right == null) { // leaf node
                return null;
            }
            if (root.left != null) {
                root.left = removeLeaves(root.left);
            }
            if (root.right != null) {
                root.right = removeLeaves(root.right);
            }
            return root;
        }
    }

    public ArrayList<Integer> inOrderList() {
        ArrayList<Integer> list = new ArrayList<>();
        list = inOrderList(overallRoot, list);
        return list;
    }

    private ArrayList<Integer> inOrderList(IntTreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        } // tree is empty
        else {//root!=null)
            list = inOrderList(root.left, list);
            list.add(root.data);
            list = inOrderList(root.right, list);
        }
        return list;
    }

    public void completeToLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("n is less than 1");
        }
        overallRoot = completeToLevel(overallRoot, 1, level);

    }

    private IntTreeNode completeToLevel(IntTreeNode root, int start, int level) {
        if (root == null && start <= level) {
            root = new IntTreeNode(-1);
        }
        if (root != null) {
            root.left = completeToLevel(root.left, start + 1, level);
            root.right = completeToLevel(root.right, start + 1, level);
        }
        return root;
    }

    public void evenLevels() {
        overallRoot = evenLevels(overallRoot, 1);
    }

    private IntTreeNode evenLevels(IntTreeNode root, int level) {
        if (root == null || (root.left == null && root.right == null && level % 2 != 0)) { // empty node or leaf node on an odd level
            return null;
        }
        if (root != null) {
            root.left = evenLevels(root.left, level + 1);
            root.right = evenLevels(root.right, level + 1);
        }
        return root;
    }

    public void makePerfect() {
        int level = this.countLevels();
        overallRoot = makePerfect(overallRoot, 1, level);
    }

    private IntTreeNode makePerfect(IntTreeNode root, int run, int level) {
        if (root == null && run <= level) {
            root = new IntTreeNode(0);
        }
        if (root != null) {
            root.left = makePerfect(root.left, run + 1, level);
            root.right = makePerfect(root.right, run + 1, level);
        }
        return root;
    }

    public void tighten() {
        overallRoot = tighten(overallRoot);
    }

    private IntTreeNode tighten(IntTreeNode root) {
        if (root == null) {
            return null;
        }
        // keep calling itself if there is still any branch node
        if (root.left == null && root.right != null) {
            return tighten(root.right);
        }else if (root.left != null && root.right == null) {
            return tighten(root.left);
        }
        root.left = tighten(root.left);
        root.right = tighten(root.right);
        return root;
    }

    public IntTree combineWith(IntTree t2){
        IntTreeNode root = combineWith(this.overallRoot,t2.overallRoot);
        return new IntTree(root);
    }

    private IntTreeNode combineWith(IntTreeNode root1, IntTreeNode root2) {
        if(root1 == null && root2 == null){ // both are null
             return null;
        }else if(root1 != null && root2 == null ){ // appear only in tree1 -> 1
            return new IntTreeNode(1,combineWith(root1.left, null),
                                combineWith(root1.right,null));
        }else if(root1 == null && root2 != null){ //appear only in tree2 -> 2
            return new IntTreeNode(2,combineWith(null, root2.left),
                                combineWith(null,root2.right));
        }else{ // appear in both ->3
            return new IntTreeNode(3,combineWith(root1.left, root2.left),
                                combineWith(root1.right,root2.right));
        }
    }


    }


