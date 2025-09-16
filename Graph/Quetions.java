//  // all path form source to target...

// import java.util.*;

// public class Quetions {
//     static class Edge{
//         int left;
//         int right;
//         Edge(int left, int right){
//             this.left = left;
//             this.right = right;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[], int edge, Scanner sc){
//         for(int i=0; i<edge; i++) {
//             System.out.print("enter "+i+" egde: ");
//             int sou = sc.nextInt();
//             int des = sc.nextInt();

//             graph[sou].add(new Edge(sou, des));
//             graph[des].add(new Edge(des, sou));
            
//         }
//     }

//      static void printGraph(ArrayList<Edge>[] graph) {
//         for (int i = 1; i <= graph.length; i++) {
//             System.out.print("Vertex " + i + ": ");
//             for (Edge edge : graph[i]) {
//                 System.out.print(" -> " + edge.left + " (w: " + edge.right + ")");
//             }
//             System.out.println();
//         }
//     } 

//     // 1. all path:-  from source to destination...
//     static void dfsPath(ArrayList<Edge>[] graph, boolean[] visited, int curr, int tar, String path){
//         // base case...
//         if(curr == tar){
//             path+=curr;
//             System.out.println(path);
//             return;
//         }

//         visited[curr] = true;
//         for (int i = 0; i < graph[curr].size(); i++) {          // for neighbour edges...
//             Edge e = graph[curr].get(i);                    // neighbour...43
//             if(visited[e.right] == false)
//             dfsPath(graph, visited, e.right, tar, path+curr);
//         }
//         visited[curr] = false;
//     }


//      // 2.  cycle detect...
//     static boolean isCycle(ArrayList<Edge>[] graph, boolean[] visited, int curr){
//         visited[curr] = true;
//         for (int i = 0; i < graph[curr].size(); i++) {          // for neighbour edges...
//             Edge e = graph[curr].get(i);                    // neighbour...43
//             if(visited[e.right] == true) { 
//                 return true;
//             }
//             isCycle(graph, visited, e.right);
//         }
//         return false;
//     }

//     // // 2.  cycle detect "undirected"...
//     // static boolean isCycle(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent){

//     //     visited[curr] = true;
//     //     for (int i = 0; i < graph[curr].size(); i++) {          // for neighbour edges...
//     //         Edge e = graph[curr].get(i);                    // neighbour...43
//     //         if(parent == e.right)
//     //             continue;
//     //         if(visited[e.right])
//     //             return true;
//     //         else if(!visited[e.right]){
//     //             if(isCycle(graph, visited, e.right, curr))
//     //             return true;
//     //          }
//     //     }
//     //     return false;
//     // }





//     // 3. topological Sort...DFS
//     static void topSortUtil(ArrayList<Edge> graph[], boolean visited[], Stack<Integer> st, int curr){
//         visited[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!visited[e.right]){
//                 topSortUtil(graph, visited, st, e.right);
//             }
//         }
//         st.push(curr);
//     }


//     // static void kahnAlgo(ArrayList<Edge> graph[], )

   

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter verties: ");
//         int vertices = sc.nextInt();
//         System.out.println("Enter Edges: ");
//         int edges = sc.nextInt();

//         ArrayList<Edge> graph[] = new ArrayList[vertices];
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         createGraph(graph, edges, sc);
//         // printGraph(graph);


//         // dfsPath(graph, new boolean[vertices], 0, 5, "");
        

//         // boolean[] visited = new boolean[vertices];
//         // boolean ans = false;
//         // for (int i = 0; i < visited.length; i++) {
//         //     if(visited[i] == false)
//         //     ans = isCycle(graph, visited, i);
//         // }
//         // System.out.println("Answer: "+ans);


        
         

//     }
// }














 // Cycle detect in directed graph...

import java.util.*;

public class Quetions {
    static class Edge{
        int left;
        int right;
        Edge(int left, int right){
            this.left = left;
            this.right = right;
        }
    }

    static void createGraph(ArrayList<Edge> graph[], int edge, Scanner sc){
        for(int i=0; i<edge; i++) {
            System.out.print("enter "+i+" egde: ");
            int sou = sc.nextInt();
            int des = sc.nextInt();

            graph[sou].add(new Edge(sou, des));
            // graph[des].add(new Edge(des, sou));
        }
    }

    static boolean isCycle(ArrayList<Edge>[] graph, boolean[] visited, int curr, boolean[] track){
        visited[curr] = false;
        track[curr] = false;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(track[e.right]){
                return true;
            }
            else if(!visited[e.right]){
                if(isCycle(graph, visited, e.right, track)){            // it-self cycle
                    return true;
                }
            }
        }
        track[curr] = false;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter verties: ");
        int vertices = sc.nextInt();
        System.out.println("Enter Edges: ");
        int edges = sc.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        createGraph(graph, edges, sc);
        
        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < visited.length; i++) {
            if(visited[i] == false)
            isCycle(graph, visited, i, new boolean[vertices]);
        }

    }
}
