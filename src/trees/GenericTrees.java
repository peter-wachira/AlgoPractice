package trees;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTrees {

    private Node root;

    public void display() {
        display(this.root);
    }

    static class Node {
        int data;
        ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    GenericTrees() {
        //construct generic tree by creating a function that returns the reference of the root node
        Scanner s = new Scanner(System.in);
        this.root = constructGenericTree(s, null, 0);
    }

    //Create a tree from input entered in console
    private Node constructGenericTree(Scanner s, Node parent, int i) {
        if (parent == null) {
            System.out.println("Enter the data for the root node");
        } else {
            System.out.print("Enter the data for the " + i + " th child of " + parent.data+" ");
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

    //calculate tree height
    public int height() {
        return this.height(root);
    }


    //recursive method that will transverse across all tree edges/nodes
    private int height(Node node){
        int tree_height = 0;
        //loop through children checking max height of subtrees using a recursive loop
        for(Node child: node.children){
            int child_height = height(child);
            if(child_height > tree_height){
                tree_height = child_height;
            }
        }
        //return height of longest sub tree + the current node
        return tree_height + 1;
    }

    //Calculate tree size
    public int size(){
        return this.size(this.root);
    }

    //recursive method that will transverse across all tree nodes
    private  int size(Node node) {
        //initialize tree size with one because of the root node
        int tree_size = 1;
        for (Node child: node.children){
            int child_size = size(child);
            tree_size += child_size;
        }
        return tree_size;
    }

    //Calculate Max largest element
    public int max_largest_element() {
        return this.maxLargestElement(this.root);
    }

    //recursive method that will transverse across all tree nodes
    private int maxLargestElement(Node node){
        int tree_max = node.data;
        for (Node child: node.children){
                int child_max = maxLargestElement(child);
            if (child_max> tree_max){
                tree_max = child_max;
            }
        }
        return tree_max;
    }

    //Show the tree om console
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
}
