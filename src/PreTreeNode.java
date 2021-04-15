import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreTreeNode {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root!=null){
            stack.push(root);
        }
        while (!stack.empty()){
            TreeNode top = stack.pop();
            list.add(top.val);
            if(top.right!=null){
                stack.push(top.right);
            }
            if(top.left!=null){
                stack.push(top.left);
            }
        }
        return list;
    }

}
