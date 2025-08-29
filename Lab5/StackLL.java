package Lab5;

class StackLL {
    class Node {
        String data;
        Node next;
        Node(String d) { data = d; }
    }

    Node head;

    void push(String d) {
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    String pop() {
        if (head == null) return null;
        String val = head.data;
        head = head.next;
        return val;
    }

    String peek() {
        return head == null ? null : head.data;
    }

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        for (Node t = head; t != null; t = t.next)
            System.out.print(t.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
