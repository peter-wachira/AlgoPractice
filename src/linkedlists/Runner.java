package linkedlists;

public class Runner {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertStart(24);
        list.insertAt(3, 66);
        list.show();
    }
}
