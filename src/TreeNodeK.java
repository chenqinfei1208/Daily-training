import java.util.ArrayList;

public class TreeNodeK {
        ArrayList<TreeNode> treenode=new ArrayList<TreeNode>();
        TreeNode KthNode(TreeNode pRoot, int k) {
            InOrder(pRoot);
            if(treenode.size()<1||k<1||k>treenode.size())
                return null;
            return treenode.get(k-1);

        }
        public void InOrder(TreeNode node)
        {
            if(node!=null)
            {
                InOrder(node.left);
                treenode.add(node);
                InOrder(node.right);
            }
        }
    }


