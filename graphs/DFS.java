package graphs;

import java.util.*;

class GraphStructureDFS {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();
    private int numOfNodes;
    private int components;

    public GraphStructureDFS(int n){
        this.numOfNodes = n;
        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    void addEdge(int node1, int node2){
//        adjList.putIfAbsent(node1, new ArrayList<>());
//        adjList.putIfAbsent(node2, new ArrayList<>());

        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }

    void processDFS(int node, List<Integer> visited){
        visited.set(node,1);
        System.out.print(node + " ");

        for(int neighbour : adjList.get(node)){
            if(visited.get(neighbour) == 0){
                processDFS(neighbour, visited);
            }
        }
    }

    void printDFS(){
        List<Integer> visited = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < numOfNodes; i++) {
            visited.add(0);
        }

        for(int node = 0; node < numOfNodes; node++){
            if(visited.get(node) == 0){
                count++;
                processDFS(node,visited);
            }
        }
        components = count;
    }

    int printComponents(){
        return components;
    }
}


public class DFS {
    public static void main(String[] args) {
        GraphStructureDFS graph = new GraphStructureDFS(8);

        graph.addEdge(0,1);
        graph.addEdge(1,5);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(3,6);

        graph.printDFS();

        System.out.println("\nNo. of components in the given graph: " + graph.printComponents());
    }
}
