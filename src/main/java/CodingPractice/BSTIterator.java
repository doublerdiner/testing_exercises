package CodingPractice;

import CodingPractice.Helpers.TreeNode;

import java.util.Stack;

class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.stack = new Stack<>();
        buildStack(root);

    }

    private void buildStack(TreeNode root) {
        while(root != null){
            stack.push(root);
            root = root.left;
        }

    }

    public int next() {
        TreeNode response = this.stack.pop();
        if(response.right != null){
            buildStack(response.right);
        }
        return response.value;
    }

    public boolean hasNext() {
        return !this.stack.isEmpty();
    }
}
