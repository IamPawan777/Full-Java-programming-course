// // undirected and unweighted graph.......

// package Graph;

// import java.util.Scanner;

// public class AdjacencyMetrix {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of vertices: ");
//         int vertices = scanner.nextInt();
//         System.out.print("Enter the number of edges:");
//         int edges = scanner.nextInt();


// // graph code...............
//         int[][] adjacencyMatrix = new int[vertices][vertices];
//         for (int i = 1; i <= edges; i++) {
//             System.out.println("Enter " + i + " edge (u v):");
//             int u = scanner.nextInt();                                       // u and v are the for direction....
//             int v = scanner.nextInt();
//             adjacencyMatrix[u][v] = 1;
//             adjacencyMatrix[v][u] = 1;           // For undirected graph (both direction)
//         }
//         System.out.println("Adjacency Matrix:");
//         for (int i = 0; i < vertices; i++) {
//             for (int j = 0; j < vertices; j++) {
//                 System.out.print(adjacencyMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }






// directed and weighted / unweighted graph.......
// package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyMetrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of edges:");
        int edges = scanner.nextInt();


        ArrayList<ArrayList<Integer>> adjacencyMatrix = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyMatrix.add(new ArrayList<>());             // otherwise store "null" values
            for (int j = 0; j < vertices; j++)
                adjacencyMatrix.get(i).add(0);                // Initialize with 0
        }

// graph code...............
        for (int i = 1; i <= edges; i++) {
            System.out.println("Enter " + i + " edge direction with weight: ");
            int u = scanner.nextInt();                  // u and v are the for edge direction....
            int v = scanner.nextInt();
            int weight = scanner.nextInt();             // For weighted graph

            // adjacencyMatrix.get(u).set(v, 1);       // For directed graph, set weight to 1
            adjacencyMatrix.get(u).set(v, weight);
        }

        // printing....
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}