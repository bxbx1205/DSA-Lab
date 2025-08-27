package CircularQueue;

public class circularQueue {
    
 int max = 5;
    int[] arr = new int[max];
    int front = -1, rear = -1;

    public void enque(int data) {
        if ((rear + 1) % max == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % max;
        arr[rear] = data;
        System.out.println("Enqueued: " + data);
    }

    public void deque() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + arr[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % max;
        }
    }

    public void printarray() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % max;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.printarray();

        q.deque();
        q.deque();
        q.printarray();

        q.enque(60);
        q.enque(70);
        q.printarray();
    }
}