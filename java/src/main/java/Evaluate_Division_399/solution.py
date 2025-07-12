class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        # equations: [a/b], [b/c]
        # values: [2.0,3.0]
        # queries: [a/c],[b/a],[a/e],[a/a],[x/x]

        graph = defaultdict(defaultdict)

        def dfs(curr, target, p, visited):
            visited.add(curr)
            ans = -1.0
            neighbors = graph[curr]
            if target in neighbors:
                ans = p * neighbors[target]
            else:
                for neighbor, val in neighbors.items():
                    if neighbor in visited:
                        continue
                    ans = dfs(neighbor, target, p * val, visited)
                    if ans != -1.0:
                        break
            visited.remove(curr)
            return ans

        # Build graph from equations and values
        for (a, b), val in zip(equations, values):
            graph[a][b] = val
            graph[b][a] = 1 / val

        # Evaluate each query
        results = []
        for a, b in queries:
            if a not in graph or b not in graph:
                results.append(-1.0)
            elif a == b:
                results.append(1.0)
            else:
                visited = set()
                res = dfs(a, b, 1, visited)
                results.append(res)
        
        return results
        