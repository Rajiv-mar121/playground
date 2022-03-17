package datastructure;

public class SingleLinkedList {


    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void createNode(Node head) {

        for (int i = 1; i < 6; i++) {
            Node temp = new Node(i, null);
            head.next = temp;
            head = temp;
        }

    }

    public void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            System.out.print("");
            head = head.next;
        }
        System.out.println(" ");
    }

    public void reverseSingleList(Node head) {
        Node current = head;
        Node last = head;
        Node start = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        System.out.println("Length " + len);
        int i = 0;
        int j = len - 1;

        while (i < j) {
            int k = 0;
            while (k < j) {
                last = last.next;
                k++;
            }
            // swapping
            int temp = current.data;
            current.data = last.data;
            last.data = temp;
            i++;
            j--;
            current = current.next;
            last = start;

        }
//https://www.youtube.com/watch?v=dR7v1sVX428
    }

    public static void main(String[] a) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Node head = new Node(10, null);
        singleLinkedList.createNode(head);
        singleLinkedList.display(head);
        singleLinkedList.reverseSingleList(head);
        singleLinkedList.display(head);
    }
}

// Detect loop in list
// Tree traversing
