package queue;


public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);

//        q.deQueue();
        q.show();
    }
}
