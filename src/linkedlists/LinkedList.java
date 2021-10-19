package linkedlists;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            //transversing between nodes
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }


    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


    public void insertStart(int data) {
        //Create node
        Node node = new Node();
        //Assign data to the node
        node.data = data;
        //Create next node
        node.next = null;
        //Assign the next element with the previous head node
        node.next = head;
        //Head is changed to that node (the node being inserted at start)
        head = node;
    }


    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            // assign the address of the next node to the address of the previous pointer
            node.next = n.next;
            n.next = node;

        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            //change head location to next node
            head = head.next;
        } else {
            //traverse to that location
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }


        }
    }
}
