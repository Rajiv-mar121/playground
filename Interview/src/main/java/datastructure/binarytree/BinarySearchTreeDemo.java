package datastructure.binarytree;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTreeDemo {
    Node root = null;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private void insert(int data) {
        System.out.println("Inserting node " + data);
        if (root == null) {
            root = new Node(data, null, null);
            return;
        }
        insertNode(root, data);
        System.out.println("-> inserted " + data);

    }

    private Node insertNode(Node root, int data) {
        System.out.println(" root node data" + root.data);
        Node tempNode = null;
        if (data <= root.data) {
            System.out.println("Putting Left ");
            if (root.left == null) {
                root.left = new Node(data, null, null);
                return root.left;
            } else {
                tempNode = root.left;
            }

        } else {
            System.out.println("Putting Right ");
            if (root.right == null) {
                root.right = new Node(data, null, null);
                return root.right;
            } else {
                tempNode = root.right;
            }
        }
        return insertNode(tempNode, data);
    }

    //preorder(root,left,right) inorder(left,root,right) postorder(left,right,root)
    public void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.print(" data ->" + root.data);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder(Node root) {
        if (root == null) return;

        traverseInOrder(root.left);
        System.out.print(" data ->" + root.data);
        traverseInOrder(root.right);
    }

    public void traversePostOrder(Node root) {
        if (root == null) return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(" data ->" + root.data);
    }

    public static void main(String[] a) {
        BinarySearchTreeDemo bt = new BinarySearchTreeDemo();
        List<Integer> list = Arrays.asList(10, 20, 21, 8, 6, 16, 23);
        list.stream().forEach(item -> bt.insert(item));
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
    }

}

// https://www.youtube.com/watch?v=XRcC7bAtL3c
// Tree traversal
// BST https://www.youtube.com/watch?v=sXABdGalFNg
