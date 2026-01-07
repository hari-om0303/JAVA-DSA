import java.util.LinkedList;
import java.util.Queue;

public class leetcode101 {
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
      }
 }

    public boolean isSymmetric(TreeNode root) {
          if (root == null){
              return false;
          }

        Queue<TreeNode> queue = new LinkedList<>();
          queue.add(root.left);
          queue.add(root.right);

          while (! queue.isEmpty()){
              TreeNode left =queue.poll();
              TreeNode right = queue.poll();

              if (left == null && right == null){
                  continue;
              }
               if (left == null || right == null){
                  return false;
              }
               if (left.val != right.val){
                   return false;
              }

               queue.add(left.left);
               queue.add(right.right);
               queue.add(left.right);
               queue.add(right.left);
          }
          return true;
    }

    public static void main(String[] args) {
       leetcode101 obj = new leetcode101();
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node4 = new TreeNode(4);

        // STEP 2: Connect nodes
        root.left = node2;
        root.right = node3;
        node2.left = node5;
        node3.right = node4;

        System.out.println(obj.isSymmetric(root));
    }
}
