package trees;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {

    public static void main(String[] args) {
        // Create object of GenericTree
        GenericTrees tree = new GenericTrees();
        tree.display();
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = node.data + " ==> ";
        for (Node child: node.children) {
            str += child.data + ", ";
        }
        System.out.println(str);

        for (Node child: node.children) {
            display(child);
        }
    }


    static class Node {
        int data;
        ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    private Node root;

    GenericTrees() {
        //construct generic tree by creating a function that returns the reference of the root node
        Scanner s = new Scanner(System.in);
        this.root = constructGenericTree(s, null, 0);
    }

    private Node constructGenericTree(Scanner s, Node parent, int i) {
        if (parent == null) {
            System.out.print("Enter the data for the root node");
        } else {
            System.out.print("Enter the data for the " + i + " th child of " + parent.data);
        }

        // take data entered and create a node
        int data = s.nextInt();
        Node node = new Node(data);
        //ask user to enter the number of children for the current node
        System.out.println("Enter the number of children for " + node.data);
        int n = s.nextInt();
        //to create the number of children we will loop n times to create the number of children entered
        for (int j = 0; j < n; j++) {
            //loop through the number of children entered & creating their subtrees
            Node child = constructGenericTree(s, node, j);
            //add the subtree to the arraylist of the nodes
            node.children.add(child);
        }
        //return reference of the root node
        return node;
    }
}
