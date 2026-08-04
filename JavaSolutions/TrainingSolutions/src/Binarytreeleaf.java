class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Binarytreeleaf {

    static int countLeaves(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(15);

        root.left = new Node(9);
        root.right = new Node(14);

        root.left.left = new Node(1);
        root.left.right = new Node(20);

        root.right.left = new Node(7);
        root.right.right = new Node(30);

        root.left.left.left = new Node(5);
        root.left.left.right = new Node(8);

        System.out.println(countLeaves(root));
    }
}