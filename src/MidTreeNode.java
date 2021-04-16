import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MidTreeNode {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode p = stack.pop();
            result.add(p.val);
            root = p.right;
        }
        return result;
    }

}
