public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left=new Node(60);
        System.out.println("height of tree edge based:"+tree.edge_base_height(tree.root));
        System.out.println("height of tree node based:"+tree.node_base_height(tree.root));
        System.out.print("INORDER:");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("PREORDER:");
        tree.preorder(tree.root);
        System.out.println();
        System.out.print("POSTORDER:");
        tree.postorder(tree.root);
        System.out.println();
        System.out.print("LEVEL ORDER:");
        tree.levelorder(tree.root);
        System.out.println();
        tree.levelorder(tree.root);

    }
}
