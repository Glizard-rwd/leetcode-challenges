package arrayandstring.twopointer;


import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class _653_TwoSumIVInputIsAnBST {
    public static boolean findTarget(TreeNode root, int k) {
        // does any node in the binary tree have value x such that x + root.val = k?
        // apply two pointer to find 2 elements in the list that sum up to k
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        int left = 0;
        int right = nums.size() - 1;
        while (left < right) {
            int current = nums.get(left) + nums.get(right);
            if (current == k) return true;
            else if (current < k) left++;
            else right--;
        }
        return false;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        // add and sort nodes in the tree to a list
        if (root == null) return; // if empty node do nothing
        inorder(root.left, list); // check and add left node of current node to list
        list.add(root.val); // add current node to list
        inorder(root.right, list); // check and add right node of current node to list

    }

    public static void main(String[] args) {
        int target = 9;
        boolean result = findTarget(new TreeNode(5,
                    new TreeNode(3, new TreeNode(2),
                    new TreeNode(4)), new TreeNode(6, null,
                    new TreeNode(7))), target);
        System.out.println(result);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {};
    TreeNode(int x) { val = x; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
