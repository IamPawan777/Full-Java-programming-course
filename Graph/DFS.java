// import java.util.*;

// public class DFS {
//     static class Edge{
//         int source;
//         int destination;
//         Edge(int source, int destination){
//             this.source = source;
//             this.destination = destination;
//         }
//     }

//      private static void createGraph(ArrayList<Edge>[] graph,int edges, Scanner sc) {
//         for (int i = 0; i < edges; i++) {
//             System.out.println("Enter "+i+" edges: ");
//             int sou = sc.nextInt();
//             int des = sc.nextInt();
//             graph[sou].add(new Edge(sou, des));
//         }
//     }

// // DFS via recursion.....
//     public static void createDFS(int curr, ArrayList<Edge>[] graph, boolean[] visited) {
//         System.out.print(curr+" ");
//         visited[curr] = true;

//         for (int i=0; i<graph[curr].size(); i++) {
//             if(visited[graph[curr].get(i).destination] == false){
//                 createDFS(graph[curr].get(i).destination, graph, visited);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter No of Vertices: ");
//         int vertices = sc.nextInt();
//         System.out.println("Enter No of Edges: ");
//         int edges = sc.nextInt();

//         ArrayList<Edge>[] graph = new ArrayList[vertices];
//         for (int i=0; i<vertices; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         createGraph(graph, edges, sc);

//         boolean[] visited = new boolean[vertices];

//         for (int i = 0; i < vertices; i++) {            // for disconnected component.......
//             if(visited[i] == false)
//             createDFS(i, graph, visited);
//         }
//     }
// }



// both "BFS" and "DFS"......  
import java.util.*;
public class DFS {
    static class Edge{
        int source;
        int destination;
        public Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph, int edges, Scanner sc){
        for (int i = 1; i <= edges; i++) {
            int sou = sc.nextInt();
            int des = sc.nextInt();
            graph[sou].add(new Edge(sou, des));
        }
    }

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

    static void createdfs(ArrayList<Edge>[] graph, boolean[] visited, int curr){
        System.out.print(curr);
        visited[curr] = true ;
        for (int i = 0; i < graph[curr].size(); i++) {
            if(visited[graph[curr].get(i).destination] == false)
            createdfs(graph, visited, graph[curr].get(i).destination);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter Edges: ");
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vertices]; 
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        createGraph(graph, edges, sc);

        boolean[] visited = new boolean[vertices];
        createdfs(graph, visited, 0);
    }
}