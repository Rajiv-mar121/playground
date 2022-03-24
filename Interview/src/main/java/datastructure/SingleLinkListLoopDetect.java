package datastructure;

import java.util.HashSet;
import java.util.Set;

public class SingleLinkListLoopDetect {

    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node createNode() {

        Node head = new Node(2, null);
        Node cur = head;
        for (int i = 4; i < 15; i++) {
            head.next = new Node(i, null);
            head = head.next;
        }
        // now adding loop
        head.next = cur;
        return cur;
    }

    private void display(Node head) {

        while (head != null) {
            System.out.print(head.data + " ->");
            head = head.next;
        }
    }

    boolean identifyLoopV1(Node head) {
        /**
         * In this method, we will keep track of traversed node hash and check with each traversing node.
         * If any match found, then we noticed Loop.
         * If we get hash as null, then we didnt find loop.
         */
        Set<Node> hash = new HashSet<>();
        while (head != null) {
            if (hash.contains(head)) {
                return Boolean.TRUE;
            }
            hash.add(head);
            head = head.next;
        }
        return Boolean.FALSE;
    }

    boolean identifyLoopV2(Node head) {

        /**
         * In this method, we will keep track of two pointers.
         * One pointer moves one step at a time and second one two steps.
         * If both pointers are same at any iteration, then the loop exists.
         */
        Node slowMv = head;
        Node fastMv = head;
        while (slowMv != null && fastMv != null && fastMv.next != null) {
            slowMv = slowMv.next;
            fastMv = fastMv.next.next;
            if (slowMv == fastMv) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static void main(String[] a) {
        SingleLinkListLoopDetect loop = new SingleLinkListLoopDetect();
        Node head = loop.createNode();
        boolean status = loop.identifyLoopV1(head);
        System.out.println(" Loop Detected or not : " + status);
        //   loop.display(head);

        boolean statusPointerApproach = loop.identifyLoopV2(head);
        System.out.println("PointerApproach Loop Detected or not : " + statusPointerApproach);
    }
}
