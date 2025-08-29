package Lab5;

class QueueLL {
    class Node {
        String data;
        Node next;
        Node(String d) { data = d; }
    }

    Node front, back;

    void enqueue(String d) {
        Node n = new Node(d);
        if (back == null) {
            front = back = n;
        } else {
            back.next = n;
            back = n;
        }
    }

    String dequeue() {
        if (front == null) return null;
        String val = front.data;
        front = front.next;
        if (front == null) back = null;
        return val;
    }

    String peek() {
        return front == null ? null : front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    void print() {
        for (Node t = front; t != null; t = t.next)
            System.out.print(t.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.print();
        System.out.println(queue.dequeue());
        queue.print();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
