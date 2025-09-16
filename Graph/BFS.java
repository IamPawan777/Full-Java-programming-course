// simple BFS code...

import java.util.*;

public class BFS {
    static class Edge{
        int source;
        int destination;
        Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }
    }
    
    private static void createGraph(ArrayList<BFS.Edge>[] graph,int edges, Scanner sc) {
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter "+i+" edges: ");
            int sou = sc.nextInt();
            int des = sc.nextInt();
            graph[sou].add(new Edge(sou, des));
        }
    }


    // static void printGraph(ArrayList<Edge>[] graph) {
    //     for (int i = 0; i < graph.length; i++) {
    //         System.out.print("Vertex " + i + ": ");
    //         for (Edge edge : graph[i]) {
    //             System.out.print(" -> " + edge.source + " : " + edge.destination);
    //         }
    //         System.out.println();
    //     }
    // }



// BFS Traversal
    static void createBFS(int v, ArrayList<Edge> graph[]) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[v];

        q.add(0);

        while(!q.isEmpty()) {
            int curr = q.remove();            
            if(visited[curr] == false){
                System.out.print(curr+" ");     //  1.
                visited[curr] = true;           //  2
                
                for (int i = 0; i < graph[curr].size(); i++) {      // 3.
                    if(visited[graph[curr].get(i).destination] == false)
                    q.add(graph[curr].get(i).destination);      
                }
            }
        }   
    }

// // or

// static void createBFS(int v, ArrayList<Edge> graph[]) {
//         Queue<Integer> q = new ArrayDeque<>();
//         boolean[] visited = new boolean[v];
//         q.add(0);
//         visited[0] = true;

//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             System.out.print(curr+" ");
            
//             for (int i = 0; i < graph[curr].size(); i++) {
//                 if(visited[graph[curr].get(i).destination] == false) {
//                     q.add(graph[curr].get(i).destination);
//                     visited[graph[curr].get(i).destination] = true;
//                 }
//             }
//         }      
//     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number Verteices: ");
        int vertices = sc.nextInt();
        System.out.println("Enter number Edges: ");
        int edges = sc.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[vertices];
        for(int i=0; i<vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        createGraph(graph, edges, sc);
        // printGraph(graph);
        createBFS(vertices, graph);
    }
}






// // Disconnected Component......

// import java.util.*;

// public class BFS {
//     static class Edge{
//         int source;
//         int destination;
//         Edge(int source, int destination){
//             this.source = source;
//             this.destination = destination;
//         }
//     }
    
//     private static void createGraph(ArrayList<BFS.Edge>[] graph,int edges, Scanner sc) {
//         for (int i = 0; i < edges; i++) {
//             System.out.println("Enter "+i+" edges: ");
//             int sou = sc.nextInt();
//             int des = sc.nextInt();
//             graph[sou].add(new Edge(sou, des));
//         }
//     }


// // BFS Traversal..........
//     static void createBFS(int v, ArrayList<Edge> graph[], boolean[] visited, int start) {           // d.change
//         Queue<Integer> q = new ArrayDeque<>();
        
//         q.add(start);                // e. start

//         while(!q.isEmpty()) {
//             int curr = q.remove();            
//             if(visited[curr] == false){
//                 System.out.print(curr+" ");     
//                 visited[curr] = true;           
                
//                 for (int i = 0; i < graph[curr].size(); i++) {      
//                     q.add(graph[curr].get(i).destination);      
//                 }
//             }
//         }   
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number Verteices: ");
//         int vertices = sc.nextInt();

//         System.out.println("Enter number Edges: ");
//         int edges = sc.nextInt();

//         ArrayList<Edge> graph[] = new ArrayList[vertices];

//         for(int i=0; i<vertices; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         createGraph(graph, edges, sc);


//         boolean[] visited = new boolean[vertices];          //a. visited here
//         for (int i = 0; i < vertices; i++) {                //b. loop on vertex
//             if(visited[i] = false)
//             createBFS(vertices, graph, visited, i);             //c. 'i' is different graph different starting
//         }
//     }
// }
