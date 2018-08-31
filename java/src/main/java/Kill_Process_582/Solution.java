package Kill_Process_582;

import java.util.*;

public class Solution {
  public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

    // Create a map of processes, where key = ppid, value = List<pid>
    Map<Integer, List<Integer>> map = new HashMap<> ();

    for (int i = 0; i < ppid.size(); i++) {
      if (ppid.get(i) > 0) {  // for each process that has a parent
        List<Integer> children = map.getOrDefault(ppid.get(i), new ArrayList<Integer>());
        children.add(pid.get(i));   // pid represents the child's id
        map.put(ppid.get(i), children);
      }
    }

    // Create a queue
    Queue<Integer> q = new LinkedList<>();
    List<Integer> ans = new ArrayList<>();

    // Add kill to the queue
    q.add(kill);

    // while q ins't empty
    while (!q.isEmpty()) {
      // poll the element
      int process = q.poll();
      ans.add(process);

      // check if it's in the map (i.e. has children)
      if (map.containsKey(process)) {
        for (int id : map.get(process)) {
          q.add(id);
        }
      }
    }

    return ans;
  }
}
