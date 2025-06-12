package graphs;

import java.util.*;

class GraphStructure {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();
    private int numOfNodes;

    public GraphStructure(int num){
        this.numOfNodes = num;
    }

    void addEdge(int node1, int node2){
        adjList.putIfAbsent(node1, new ArrayList<>());
        adjList.putIfAbsent(node2, new ArrayList<>());

        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }

    void printGraph(){

        // easy way to print the graph
        System.out.println(adjList);

        // looping way
        for(Integer node:adjList.keySet()){
            System.out.print(node + " ---> [");
            for(Integer neighbour:adjList.get(node)){
                System.out.print(neighbour + ",");
            }
            System.out.println("]");
        }
    }
}

public class AdjacentList {
    public static void main(String[] args) {
        GraphStructure graph = new GraphStructure(8);

        // since nodes are 8, edges would be 7 -> n-1
        graph.addEdge(0,1);
        graph.addEdge(0,5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(5,6);
        graph.addEdge(5,4);
        graph.addEdge(5,7);

        graph.printGraph();
    }
}
