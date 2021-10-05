package queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int rear;
    int front;

    public void enQueue(int data){
        queue[rear] = data;
        rear = rear +1;
        size = size +1;
    }

    public void  show(){
        System.out.print("Elements: ");
        for (int i =0; i<size;i++){
            System.out.print(queue[i] +" ");
        }
    }

}
