package Chapter17.Exercise;

public class IntTreeClient2
{
    public static final IntTree ref1 = new IntTree(new IntTreeNode(3, new IntTreeNode(5,new IntTreeNode(1,null,null),null),new IntTreeNode(2,new IntTreeNode(4,null,null),new IntTreeNode(6,null,null))));
    public static final IntTree ref2 = new IntTree(new IntTreeNode(2, new IntTreeNode(8,new IntTreeNode(0,null,null),null), new IntTreeNode(1,new IntTreeNode(7, new IntTreeNode(4,null,null),null),new IntTreeNode(6,null,new IntTreeNode(9,null,null)))));
    public static final IntTree ref3 = new IntTree(new IntTreeNode(2,new IntTreeNode(3,new IntTreeNode(8,null,null),new IntTreeNode(7,null,null)),new IntTreeNode(1,null,null)));
    public static void main(String[] args)
    {


        IntTree tree = new IntTree(12);
        tree.printSideWays();
        tree.printLeftNodes();
        System.out.println("tree has " + tree.countLeftNodes() +" left nodes"); //#1
        System.out.println("depth sum of this tree is:"+ tree.depthSum());  //#3
        tree.printLevel(3); // #5
        tree.printLeaves(); //#6
        //System.out.println("countEvenBranches:"+tree.countEvenBranches());
        System.out.print("\nevenBranches: ");
        tree.printEvenBranches();
        System.out.println("tree.countEvenBranches:"+tree.countEvenBranches());
        tree.countEmpty();
        tree.doublePositives();
        tree.printSideWays();
        System.out.println("ref1.equals(ref2):"+ref1.equals(ref1.getOverallRoot(),ref1.getOverallRoot()));
        System.out.println("ref3.isFull():"+ref3.isFull());


        ref1.printPreOrder();
        ref1.printSideWays();
        System.out.println("ref1.numberNodes():"+ref1.numberNodes());
        ref1.printSideWays();
        //ref2.printPreOrder();

        ref3.printSideWays();
        System.out.println("ref3.min():"+ref3.min());
        System.out.println("ref3.max():"+ref3.max());


    }
}
