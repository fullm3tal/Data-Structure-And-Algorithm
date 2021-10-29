package leetcode.tree;

import com.sun.source.tree.Tree;
import leetcode.tree.TreeNodeProvider.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafBinary {

    static int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        return sum;
    }

    public static int dfsPreOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root.left == null && root.right == null) {
            return root.val;
        } else {
            return traversePreOrder(root, list);
        }
    }

    private static int traversePreOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return sum;
        }
        list.add(root.val);
        if (root.left != null) {
            traversePreOrder(root.left, list);
            if (root.left.left == null && root.left.right == null) {
                StringBuilder nums = new StringBuilder();
                for (int i : list) {
                    nums.append(i);
                }
                sum += Integer.parseInt(nums.toString(), 2);
            }
            list.remove(list.size() - 1);
        }

        if (root.right != null) {
            traversePreOrder(root.right, list);
            if (root.right.left == null && root.right.right == null) {
                StringBuilder nums = new StringBuilder();
                for (int i : list) {
                    nums.append(i);
                }
                sum += Integer.parseInt(nums.toString(), 2);
            }
            list.remove(list.size() - 1);
        }
        return sum;
    }


}
