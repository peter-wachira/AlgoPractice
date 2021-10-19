package trees;

public class Runner {

    public static void main(String[] args) {
        GenericTrees tree = new GenericTrees();

         /* Create object of GenericTree
        Sample  input to create a tree
        * -100 3 20 1 -49 1 -1000 0 2 2 60 0 23 1 45 1 90 0 17 3 26 0 27 0 -83 0
        *  Will create a tree like
        -100 ==> 20, 2, 17,
        20 ==> -49,
        -49 ==> -1000,
        -1000 ==>
        2 ==> 60, 23,
        60 ==>
        23 ==> 45,
        45 ==> 90,
        90 ==>
        17 ==> 26, 27, -83,
        26 ==>
        27 ==>
        -83 ==>
        */
        GenericTrees genericTrees = new GenericTrees();
        genericTrees.display();
        System.out.println("Tree height is: " + genericTrees.height());
        System.out.println("Size of tree is: " + genericTrees.size());
        genericTrees.size();
    }
}

