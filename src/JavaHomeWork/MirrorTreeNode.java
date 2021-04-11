package JavaHomeWork;
import java.util.*;

public class MirrorTreeNode {
    public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }
        public TreeNode Mirror (TreeNode pRoot) {
            if(pRoot==null)
                return pRoot;
            if(pRoot.left==null && pRoot.right==null)
                return pRoot;
            //处理根节点，交换左右节点
            TreeNode temp=pRoot.left;
            pRoot.left=pRoot.right;
            pRoot.right=temp;
            //处理左子树
            Mirror(pRoot.left);
            //处理右子树
            Mirror(pRoot.right);
            return pRoot;
        }
    }



