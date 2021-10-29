package leetcode.linked_list;

import leetcode.tree.SumRootToLeafBinary;
import leetcode.tree.TreeNodeProvider;

import java.util.ArrayList;

public class TreeNodeDemo {

    public static void main(String[] args) {

//        1,0,1,0,1,0,1
        TreeNodeProvider provider = new TreeNodeProvider();
        provider.insert(1);
        System.out.println();
        int sum =SumRootToLeafBinary.dfsPreOrder(provider.root);
        System.out.println(sum);
    }

}
