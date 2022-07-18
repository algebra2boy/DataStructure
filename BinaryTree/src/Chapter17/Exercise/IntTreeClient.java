package Chapter17.Exercise;

import Chapter17.Exercise.IntTree;

public class IntTreeClient
{
    public static void main(String[] args)
    {
        IntTree t = new IntTree(12);

        System.out.println("Tree structure on its side:");
        t.printSideWays();
        System.out.println();
        t.printPreOrder();
        t.printInOrder();
        t.printPostOrder();
        System.out.println("tree's level:"+t.countLevels());
        System.out.println("tree's leaves:"+t.countLeaves());
        System.out.println("sum of the tree is:" +t.sum());
        System.out.println("size of the tree is:" +t.size());
        System.out.println("tree's branches:"+t.countBranches());
        System.out.println("branches:" + t.countBranchesAnotherMethod());

    }

}