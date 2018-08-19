package Evaluate_Division_399;

import java.util.*;

public class Solution {
  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

    double[] ans = new double[queries.length];

    // Edge cases
    if (equations == null || values == null || equations.length != values.length) return null;

    HashMap<String, Vertex> map = new HashMap<>();

    // Populate the map of vertices and edges
    for (int i = 0; i < equations.length; i++) {
      String aName = equations[i][0];
      String bName = equations[i][1];
      Vertex a;
      Vertex b;

      // Get vertex from map or create a new one
      if (map.containsKey(aName)) {
        a = map.get(aName);
      } else {
        a = new Vertex(aName);
        map.put(aName, a);
      }

      if (map.containsKey(bName)) {
        b = map.get(bName);
      } else {
        b = new Vertex(bName);
        map.put(bName, b);
      }

      // Get the value
      double w = values[i];

      // Add edges with weight to the vertices
      a.addConnection(b, w);
      b.addConnection(a, 1/w);
    }

    // Go through queries
    for (int i = 0; i < queries.length; i++) {
      String aName = queries[i][0];
      String bName = queries[i][1];

      if (!map.containsKey(aName) || !map.containsKey(bName)) {
        ans[i] = -1.00;
      } else {
        ans[i] = getPath(map.get(aName), map.get(bName), 1.00);
      }
    }

    return ans;
  }

  private double getPath(Vertex a, Vertex b, double weight) {
    Set<Vertex> visited = new HashSet<>();
    Queue<VertexWeight> q = new LinkedList<>();

    q.add(new VertexWeight(a, 1));
    VertexWeight curr = q.peek();

    while (!q.isEmpty() && curr.vertex != b) {
      curr = q.poll();
      visited.add(curr.vertex);

      for (Edge edge : curr.vertex.connections) {
        Vertex v = edge.end;
        Double p = edge.weight;

        // Handle only not visited vertices
        if (!visited.contains(v)) {
          q.add(new VertexWeight(v, p * curr.weight));
        }
      }

    }
    return curr.vertex == b ? curr.weight : -1 ;
  }

  private class VertexWeight {
    Vertex vertex;
    double weight;

    VertexWeight(Vertex vertex, double weight) {
      this.vertex = vertex;
      this.weight = weight;
    }
  }

  private class Vertex {
    String name;
    HashSet<Edge> connections;

    Vertex(String name) {
      this.name = name;
      connections = new HashSet<>();
    }

    void addConnection(Vertex v, double weight) {
      Edge e = new Edge(this, v, weight);
      connections.add(e);
    }

    public String toString() {
      return this.name;
    }
  }

  private class Edge {
    Vertex start;
    Vertex end;
    double weight;

    Edge(Vertex start, Vertex end, double weight) {
      this.start = start;
      this.end = end;
      this.weight = weight;
    }

    public String toString() {
      return start + "->" + end + " (" + weight + ")";
    }
  }
}
