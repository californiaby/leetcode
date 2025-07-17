package Binary_Tree_Vertical_Order_Traversal_314;

class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList();
        if (root == null) return output;
        
        Map<Integer, ArrayList> columnTable = new HashMap();
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque();
        int column = 0;
        int min = 0;
        int max = 0;
        queue.offer(new Pair(root, column));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            column = pair.getValue();
            if (node == null) {
                continue;
            }

            if (!columnTable.containsKey(column)) {
                columnTable.put(column, new ArrayList<Integer>());
            }
            columnTable.get(column).add(node.val);
            min = Math.min(min, column);
            max = Math.max(max, column);

            queue.offer(new Pair(node.left, column - 1));
            queue.offer(new Pair(node.right, column + 1));
        }

        for (int i = min; i <= max; i++) {
            output.add(columnTable.get(i));
        }

        return output;
    }
}