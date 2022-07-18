/**
 * Liang pg 1055 Chapter 28 #4
 * (Find connected components) Create a new class named MyGraph as a subclass
 * of UnweightedGraph that contains a method for finding all connected components
 * in a graph with the following header:
 * public List<List<Integer>> getConnectedComponents();
 * The method returns a List<List<Integer>>. Each element in the list isR
 * another list that contains all the vertices in a connected component. For example,
 * for the graph in Figure 28.21b, getConnectedComponents() returns
 * [[0, 1, 2, 3], [4, 5]].
 */

import java.lang.reflect.Array;
import java.util.*;

public class Liang_Chapter28_4_Method_1{
    public static void main(String[] args) {
        // Data
        String data[] = {
                "6\n"
                        + "0 1 2\n"
                        + "1 0 3\n"
                        + "2 0 3 4\n"
                        + "3 1 2 4 5\n"
                        + "4 2 3 5\n"
                        + "5 3 4",
                "6\n"
                        + "0 1 2 3\n"
                        + "1 0 3\n"
                        + "2 0 3 \n"
                        + "3 0 1 2\n"
                        + "4 5\n"
                        + "5 4"};

        // Build the 'edges' list
        System.out.println(" Build the 'edges' list: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(" \n ============================================ \n data[" + i + "]: ");
            List<AbstractGraph.Edge> edges = new ArrayList<>();
            Scanner scan = new Scanner(data[i]);
            int numVerticesInList = Integer.parseInt(scan.nextLine());
            while (scan.hasNextLine())
            {
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
            Graph<Integer> graph = new UnweightedGraph<>(edges, numVerticesInList);
            System.out.println("\n graph.printEdges(): ");
            graph.printEdges();

            // Create a list of lists of connected Edges.
            ArrayList<List<Integer>> connectedComponents = new ArrayList<List<Integer>>();
            // 1. Create a set of Integer vertices
            Set<Integer> vertexSet = new HashSet<Integer>();
            for (int q = 0; q < numVerticesInList; q++)
            {
                vertexSet.add(q);
            }

            //2. Go thru the entire set picking out vertices in the same tree

            while (!vertexSet.isEmpty())
            {

                Iterator edge_itr = vertexSet.iterator();
                // 3. Pick an edge.
                int edge = (int) edge_itr.next();

                // 4. Create a tree via this startVertex
                UnweightedGraph<Integer>.Tree t = graph.bfs(edge);

                // 5. Get list of Vertices.
                ArrayList<Integer> verticesList = (ArrayList<Integer>) t.getSearchOrder();

                // 6. Put verticesList into connectedComponents
                connectedComponents.add(verticesList);

                // 7. Take verticesList out of vertexSet
                for (int j = 0; j < verticesList.size(); j++)
                {
                    vertexSet.remove(verticesList.get(j));
                }
            } // while
            System.out.println("connectedComponents" + connectedComponents);
        }
         // for
        System.out.println("\n\n ------------------- All Done!! -------------------");
    } // main
}
  // Liang_Chapter28_4

// =====================================================================
