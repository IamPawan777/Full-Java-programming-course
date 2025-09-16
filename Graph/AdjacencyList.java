// // package Graph;

// import java.util.Scanner;
// import java.util.ArrayList;

// public class AdjacencyList {
//     static class Edge {
//         int source;
//         int destination;

//         public Edge(int source, int destination) {
//             this.source = source;
//             this.destination = destination;
//         }
//     }

// // graph creation.............
//     static void createGraph(ArrayList<Edge>[] graph, int edges, Scanner scanner) {
//         for (int i = 1; i <= edges; i++) {
//             System.out.println("Enter edge " + i + " (source destination):");
//             int sou = scanner.nextInt();
//             int des = scanner.nextInt();
//             graph[sou].add(new Edge(sou, des));
//             // graph[des].add(new Edge(des, sou));           // this line for undirected graph        
//         }
//     }

//     static void printGraph(ArrayList<Edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             System.out.print("Vertex " + i + ": ");
//             for (Edge edge : graph[i]) {
//                 System.out.print(" -> " + edge.destination);
//             }
//             System.out.println();
//         }
//     } 

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of vertices: ");
//         int vertices = scanner.nextInt();
//         System.out.print("Enter the number of edges: ");
//         int edges = scanner.nextInt();

//         ArrayList<Edge>[] graph = new ArrayList[vertices];
//         for (int i = 0; i < vertices; i++) {
//             graph[i] = new ArrayList<Edge>();           // sothat no NullPointerException occurs
//         }

//         createGraph(graph, edges, scanner);
//         printGraph(graph);
//         scanner.close();
//     }
// }







// Undirected and weighted graph.......

// package Graph;

import java.util.*;
import java.util.Scanner;

class  AdjacencyList {
    static class Pair {
        int des;
        int weight;
        Pair(int des, int weight) {
            this.des = des;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Pair> graph[], int edge, Scanner sc){
        for(int i=1; i<=edge; i++) {
            System.out.println("Enter edge "+ i + " :  ");
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();                   // weight of the edge
            graph[s].add(new Pair(d, w));
            // graph[d].add(new Pair(s, w));        // For undirected graph
        }
    }


    static void printGraph(ArrayList<Pair>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Pair edge : graph[i]) {
                System.out.print(" -> " + edge.des + " (w: " + edge.weight + ")");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertices, edges;
        System.out.print("Enter the number of vertices: ");
        vertices = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        edges = sc.nextInt();

        ArrayList<Pair>[] graph = new ArrayList[vertices];

        for(int i=0; i<vertices; i++) {
           graph[i] = new ArrayList<>();
        }


        createGraph(graph, edges, sc);
        printGraph(graph);
        sc.close();
    }
        
}



