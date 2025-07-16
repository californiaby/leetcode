package Range_Sum_of_BST_938;


class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack();

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node == null) {
                continue;
            }

            if (node.val >= low && node.val <= high) {
                ans += node.val;
            }

            if (node.val > low) {
                stack.push(node.left);
            }

            if (node.val < high) {
                stack.push(node.right);
            }
        }

        return ans;
    }

    public int dfs(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int validatedVal = (root.val >= low && root.val <= high) ? root.val : 0;
        int leftSum = dfs(root.left, low, high);
        int rightSum = dfs(root.right, low, high);

        return  validatedVal + leftSum + rightSum;
    }