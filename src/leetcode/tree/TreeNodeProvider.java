package leetcode.tree;

import java.util.ArrayList;

public class TreeNodeProvider {

    public TreeNode root;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void insert(int val) {
        TreeNode node = new TreeNode(val);
        TreeNode currentNode = root;
        if (root == null) {
            root = node;
            return;
        }
        while (true) {
            if (val < currentNode.val) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    return;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = node;
                    return;
                }
                currentNode = currentNode.right;
            }
        }
    }

    public static ArrayList<Integer> dfsPreOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traversePreOrder(root, list);
        return list;
    }

    private static void traversePreOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left != null) {
            traversePreOrder(root.left, list);
        }
        if (root.right != null) {
            traversePreOrder(root.right, list);
        }
    }

    public static ArrayList<Integer> dfsInOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traverseInOrder(root, list);
        return list;
    }

    private static void traverseInOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            traverseInOrder(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            traverseInOrder(root.right, list);
        }
    }

    public static ArrayList<Integer> dfsPostOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traversePostOrder(root, list);
        return list;
    }

    private static void traversePostOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            traversePostOrder(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            traversePostOrder(root.right, list);
        }
    }


}
