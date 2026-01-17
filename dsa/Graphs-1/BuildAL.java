/**
 * Implementing/Building an Adjacency List
 */

import java.util.*;

public class BuildAL {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    
    }
    public static void main(String[] args) {
        /*
                (5)
            0 ------- 1
                    /   \
               (1) /     \ (3)
                  /       \
                 2 ------- 3
                 |  (1)
                 |
             (2) |
                 |
                 4
        */

        int V = 5; // no. of vertices in the graph

        // we are creating an array of arrayList, basically array holds the vertices V, and the arrayList of that vertix V will store the neighbors and the edge information using the edge class
        @SuppressWarnings("unchecked") // just to supress the warning that i am getting in terminal
        ArrayList<Edge>[] graph = new ArrayList[V]; // currenly this contains null value -> we will store empty arrayList into this instead of null

        // to store empty list inside the array instead of null values
        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 Vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 Vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // internally it will look like this -> [[{0,1,5}], [{1,0,5}, {1,2,1}, {1,3,3}] .....]

        /**
         * Now if i want to print all the 1's neighbors
         */
        for(int i=0; i<graph[1].size(); i++) {
            Edge e = graph[1].get(i); // now e is an edge storing src, dest, weight
            System.out.println(e.dest);
        }
    }
}
