import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    int edge_base_height(Node root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(edge_base_height(root.left), edge_base_height(root.right));
        }
    }
        int node_base_height(Node root) {
            if (root == null) {
                return 0;
            } else {
                return 1 + Math.max(node_base_height(root.left), node_base_height(root.right));
            }
        }
        //DFS Depth First Search
        public void inorder (Node root){//left->root->right
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
        public void preorder (Node root){//root->left->right
            if (root == null) {
                return;
            }
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public void postorder (Node root){//left->right->root
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
        public int findMax (Node root){
            if (root == null) return Integer.MIN_VALUE;
            int leftMax = findMax(root.left);
            int rightMax = findMax(root.right);
           return Math.max(root.value,Math.max(leftMax, rightMax));

        }
    }







