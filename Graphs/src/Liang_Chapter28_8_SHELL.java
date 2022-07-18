
/** Liang pg 1055 Chapter 28 #8
 (Test bipartite) Recall that a graph is bipartite if its vertices can be divided into
 two disjoint sets such that no edges exist between vertices in the same set. Add
 a new method in AbstractGraph with the following header to detect whether
 the graph is bipartite:
 public boolean isBipartite();
 */

import java.util.*;

public class Liang_Chapter28_8_SHELL
{
    public static void main()
    {
        HashSet<Integer> setA=null;
        HashSet<Integer> setB=null;
        boolean isBipartite;

        // Data
        String data[] = {              //    0------1
                "5\n"                  //    |     /|    YES, isBipartite() == true
                        + "0 1 3\n"    //    |    / |       setA    setB
                        + "1 0 2 4\n"  //    |   4  |        0        1
                        + "2 1 3\n"    //    | /    |        2        3
                        + "3 0 2 4\n"  //    |/     |        4
                        + "4 1 3\n",   //    3------2

                                                  /*          SetA    SetB
                                                             0       1
                                                             2       3
                                      //    0------1         4 */
                "5\n"                 //    |     /|    NO, isBipartite() == false
                        + "0 1 3\n"   //    |    / |
                        + "1 0 2 4\n" //    |   4  |        setA    setB
                        + "2 1 3 4\n" //    | /  \ |          0        1
                        + "3 0 2 4\n" //    |/    \|          2        3
                        + "4 1 2 3\n",//    3------2          4        2    2 is in both sets!

        };                                         /*         SetA     SetB
                                                              0         1
                                                              2         3
                                                                        4 */
        // Build the 'edges' list
        System.out.println(" Build the 'edges' list: ");
        for (int i=0; i<data.length; i++)
        {
            List<AbstractGraph.Edge> edges = new ArrayList<>();
            Scanner scan = new Scanner(data[i]);
            int numVerticesInList = Integer.parseInt(scan.nextLine());
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] splitLine = line.split(" ");
                int u = Integer.parseInt(splitLine[0]);
                for (int j = 1; j < splitLine.length; j++) {
                    int v = Integer.parseInt(splitLine[j]);
                    edges.add(new AbstractGraph.Edge(u, v));
                }
                System.out.println("edges: ");
                System.out.println(edges);
            }// while

            System.out.print("\n\n <<<<<<<<<<<<<<<<<<<<< data[" + i + "] >>>>>>>>>>>>>>>>>>>>>>>>>");
            Graph<Integer> graph = new UnweightedGraph<>(edges,numVerticesInList);
            System.out.println("\n graph.printEdges(): ");
            graph.printEdges();

            // Create a list of lists of connected Edges.
            ArrayList<List<Integer>> connectedComponents = new ArrayList<List<Integer>>();

            // 1. Create a set of all Integer vertices
            Set<Integer> verticeSet = new HashSet<Integer>();

            for(int q = 0; q < numVerticesInList; q++)
            {
                verticeSet.add(q);
            }

            // 2. Go thru the entire set taking a vertice and putting it into either setA, setB or both.
            //    If it goes into both then the graph is NOT Bipartite!
            while(!verticeSet.isEmpty()){

                // 3. Pick an edge.
                Iterator edge_itr = verticeSet.iterator();
                int edge = (int) edge_itr.next();

                // 4. Create a list of currentVertex's neighbors
                ArrayList<Integer> neighbors = (ArrayList<Integer>) graph.getNeighbors(edge);

                // 5. Get a count of neighbors' vertices in setA and setB

                // 6. Check to see if the graph is Bipartite via the counts
                isBipartite = setA.size() == setB.size();

                // 7. remove currentVertex from vertexSet
                verticeSet.remove(edge);
            }

            System.out.println("setA: [");
            for (Iterator itr=setA.iterator(); itr.hasNext(); )
            {
                System.out.print(itr.next()+", ");
            }
            System.out.println("]");
            System.out.println("setB: [");
            for (Iterator itr=setB.iterator(); itr.hasNext(); )
            {
                System.out.print(itr.next()+", ");
            }
            System.out.println("]");

            //boolean isBipartite = setA.con

            /*if (isBipartite) {
                System.out.println("\n\n The graph IS Bipartite!!!");
            } else {
                System.out.println("\n\n The graph is NOT Bipartite!!!");
            }*/
            System.out.println("\n\n ------------------- All Done!! -------------------");

        } // for - data.length

    } // main

}  // Liang_Chapter28_8_SHELL


