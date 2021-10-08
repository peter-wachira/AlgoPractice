package queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int rear;
    int front;

    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear +1)%5;
        size = size +1;
    }

    public int deQueue(){
        //get front item
        int data = queue[front];
        //increment front by one index
        front = (front +1)%5;
        //decrease size by one element
        size = size-1;
        return data;
    }

    public void  show(){
        System.out.print("Elements: ");
        for (int i =0; i<size;i++){
            System.out.print(queue[(front + i)%5] +" ");
        }



    }


}
