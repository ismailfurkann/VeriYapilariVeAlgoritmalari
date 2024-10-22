class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    void insert(int value) {
        root = insertRec(root, value);
    }

    TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    void printTree() {
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};

        for (int value : arr) {
            bst.insert(value);
        }

        bst.printTree();
    }
}
