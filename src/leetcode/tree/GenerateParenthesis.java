package leetcode.tree;

import java.util.ArrayList;

public class GenerateParenthesis {

    public static TreeNode root;

    public static class TreeNode {
        char value;
        int level;
        int balancer;
        TreeNode left;
        TreeNode right;

        TreeNode(char value, int level, int balancer) {
            this.value = value;
            this.level = level;
            this.balancer = balancer;
        }
    }

    public static void generatePairs(int size, TreeNode currentNode) {
        if (currentNode.level < size) {
            if (currentNode.left == null) {
                currentNode.left = new TreeNode('(', currentNode.level + 1, currentNode.balancer + 1);
                generatePairs(size, currentNode.left);
            }
            if (currentNode.right == null) {
                currentNode.right = new TreeNode(')', currentNode.level + 1, currentNode.balancer - 1);
                generatePairs(size, currentNode.right);
            }
        }
        System.out.println(currentNode.level);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        TreeNode rootNode = new TreeNode('(', 1,1);
        int size = 3;
        generatePairs(size * 2, rootNode);
        traversePreOrder(rootNode, list, "(", size);
        System.out.println("test");
    }

    private static void traversePreOrder(TreeNode root, ArrayList<String> list, String value, int size) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.balancer >=0 && root.balancer <= size) {
            value= value + root.left.value;
            traversePreOrder(root.left, list, value, size);
            if (root.left.left == null && root.left.right == null) {
                if(root.balancer == 0 ) {
                    list.add(value.toString());
                }
            }
        }
        if (root.right != null && root.balancer >0 && root.balancer <= size) {
            value= value + root.right.value;
            traversePreOrder(root.right, list, value, size);
            if (root.right.left == null && root.right.right == null) {
                if(root.right.balancer == 0) {
                    list.add(value);
                }
            }
        }
    }

}
