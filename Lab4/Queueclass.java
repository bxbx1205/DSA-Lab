package Lab4;

public class Queueclass {
    public int max = 5;
    public int[] arr = new int[max];
    public int r = -1; 
    public int f = -1; 

    public void enque(int data) {
        if (r == max - 1) {
            System.out.println("Overflow condition");
            return;
        }
        if (f == -1) {
            f = 0; 
        }
        r++;
        arr[r] = data;
        System.out.println("Enqueued: " + data);
    }

    public void deque() {
        if ((f == -1 && r==-1) || f > r) {
            System.out.println("Underflow condition");
            return;
        }
        int del = arr[f];
        System.out.println("Dequeued: " + del);
        f++;

        
        if (f > r) {
            f = -1;
            r = -1;
        }
    }

    public void printarray() {
        if (f == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = f; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queueclass q = new Queueclass();
        q.enque(12);
        q.enque(123);
        q.enque(14);
        q.enque(15);
        q.enque(123);
        q.enque(12); 
        q.printarray();

        q.deque();
        // q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();


        q.printarray();

          
        q.printarray();
    }
}
