package Evaluate_Division_399;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SolutionBFS {

    // [a,b], [b,c], [j,k] : a->b, b->c, j->k : a->b->c, j->k
    // [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // Is it guaranteed that equations.size() == values.length?

        double[] answers = new double[queries.size()];

        // 1. Build graphs from equations and values.
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            // Get nodes and weight from equations and values.
            List<String> eq = equations.get(i); // ["a", "b"]
            String from = eq.get(0);
            String to = eq.get(1);
            double weight = values[i];

            // Create new nodes in graph if not present.
            if (!graph.containsKey(from)) {
                graph.put(from, new HashMap<String, Double>());
            }
            if (!graph.containsKey(to)) {
                graph.put(to, new HashMap<String, Double>());
            }

            // Update the nodes + edges.
            graph.get(from).put(to, weight);
            graph.get(to).put(from, 1 / weight); // reverse equation: a/b = c, b/a = 1/c
        }


        // 2. Iterate over queries and calcualte answers.
        for (int i = 0; i < queries.size(); i++) {
            List<String> q = queries.get(i); // [a,c]
            String from = q.get(0);
            String to = q.get(1);
            
            if (!graph.containsKey(from) || !graph.containsKey(to)) {
                // Neither node is in graph.
                answers[i] = -1.0;
            } else if (from == to) {
                answers[i] = 1.0;
            } else {
                HashSet<String> visited = new HashSet<>();
                answers[i] = dfs(graph, from, to, 1, visited);
            }

        }

        return answers;
    }

    private double dfs(HashMap<String, HashMap<String, Double>> graph, String from, String to, double multiplier, HashSet<String> visited) {
        // Start with the current node.
        // Add it to the set of visited.
        visited.add(from);
        double val = -1.0;

        // Get all neighbors. Check if they match the target.
        Map<String, Double> neighbors = graph.get(from);
        if (neighbors.containsKey(to)) {
            val = multiplier * neighbors.get(to);
        } else {
            for (Map.Entry<String, Double> pair : neighbors.entrySet()) {
                String neighbor = pair.getKey();
                Double weight = pair.getValue();

                // Skip neighbor if previously visited.
                if (visited.contains(neighbor)) {
                    continue;
                } else {
                    // Call dfs for each neighbor with updated multiplier -- recursion.
                    val = dfs(graph, neighbor, to, multiplier * weight, visited);
                    // val can be -1.0 -- still no match, or different value -- bingo
                    // Calculate the val, choose one that either says not found (-1.0) or calcualted.
                    if (val != -1.0) {
                        break;
                    }
                }
            }
        }        

        // Exit recursion: remove node from visited. Return value.
        visited.remove(from);
        return val;
    }
    
}
