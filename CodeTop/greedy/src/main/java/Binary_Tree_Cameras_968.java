public class Binary_Tree_Cameras_968 {
    private int cameras = 0;

    public int minCameraCover(TreeNode root) {
        // If the root returns 0, it means the root itself is uncovered
        if (dfs(root) == 0) {
            cameras++;
        }
        return cameras;
    }

    /**
     * States:
     * 0: Node needs coverage
     * 1: Node has a camera
     * 2: Node is covered (by a child)
     */
    private int dfs(TreeNode node) {
        // Base case: null nodes are considered "already covered"
        if (node == null) {
            return 2;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        // If either child is uncovered, this node MUST have a camera
        if (left == 0 || right == 0) {
            cameras++;
            return 1;
        }

        // If either child has a camera, this node is now covered
        if (left == 1 || right == 1) {
            return 2;
        }

        // Otherwise, the children are covered, but this node needs its parent to cover it
        return 0;
    }

    public static void main(String[] args) {
        Binary_Tree_Cameras_968 solver = new Binary_Tree_Cameras_968();
        TreeNode root = new TreeNode(0);
        //root = [0,0,null,0,0]
        root.right = null;
        TreeNode left = new TreeNode(0);
        TreeNode leftleft = new TreeNode(0);
        TreeNode leftright = new TreeNode(0);
        left.left = leftleft;
        left.right = leftright;
        root.left = left;
        int result = solver.minCameraCover(root);
        System.out.println("Maximum children: " + result);
    }

     public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }}

}
