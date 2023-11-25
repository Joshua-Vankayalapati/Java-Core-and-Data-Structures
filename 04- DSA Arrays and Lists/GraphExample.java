package com.example.DSA;

import java.util.LinkedList;

public class GraphExample {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    public GraphExample(int vertices) {
        this.V = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); // For undirected graph
    }

    // Depth-First Search (DFS) traversal starting from a given vertex
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[V];
        dfsRecursive(startVertex, visited);
    }

    private void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
    	GraphExample graph = new GraphExample(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS traversal starting from vertex 0:");
        graph.dfs(0);
    }
}
