package Chapter17.Exercise;


public class IntTreeClient3
{
    public static final IntTree ref1 = new IntTree(new IntTreeNode(3, new IntTreeNode(5,new IntTreeNode(1,null,null),null),new IntTreeNode(2,new IntTreeNode(4,null,null),new IntTreeNode(6,null,null))));
    public static final IntTree ref2 = new IntTree(new IntTreeNode(2, new IntTreeNode(8,new IntTreeNode(0,null,null),null), new IntTreeNode(1,new IntTreeNode(7, new IntTreeNode(4,null,null),null),new IntTreeNode(6,null,new IntTreeNode(9,null,null)))));
    public static final IntTree ref3 = new IntTree(new IntTreeNode(2,new IntTreeNode(3,new IntTreeNode(8,null,null),new IntTreeNode(7,null,null)),new IntTreeNode(1,null,null)));

    public static void main(String[] args){
        /*ref3.printSideWays();
        ref3.removeLeaves();
        System.out.println("tree.printSideWays()");
        ref3.printSideWays();
        System.out.println(ref3.inOrderList()+"\n");*/


        /*ref2.printSideWays();
        System.out.println("ref2.completeToLevel(4)");
        ref2.completeToLevel(4);
        ref2.printSideWays();*/

        /*ref2.printSideWays();
        System.out.println("ref2.evenLevels():");
        ref2.evenLevels();
        ref2.printSideWays();*/

        /*ref2.printSideWays();
        System.out.println("ref2.makePerfect()");
        ref2.makePerfect();
        ref2.printSideWays();*/

        /*IntTree tree = new IntTree(new IntTreeNode(1,new IntTreeNode(2,new IntTreeNode(3,new IntTreeNode(4,new IntTreeNode(5,null,null),null),null),null),new IntTreeNode(8)));
        tree.printSideWays();
        System.out.println("tighten");
        tree.tighten();
        tree.printSideWays();*/

        ref2.printSideWays();
        ref3.printSideWays();
        IntTree tree3 = ref2.combineWith(ref3);
        tree3.printSideWays();



    }
}
