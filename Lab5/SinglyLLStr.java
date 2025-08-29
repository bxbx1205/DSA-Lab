package Lab5;

class SinglyLLStr {
    class Node {
        String data;
        Node next;
        Node(String d) { data = d; }
    }

    Node head;

    void addFirst(String d) {
        Node n = new Node(d);
        n.next = head;
        head = n;
    }

    void addLast(String d) {
        Node n = new Node(d);
        if (head == null) { head = n; return; }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = n;
    }

    void delFirst() {
        if (head != null) head = head.next;
    }

    void delLast() {
        if (head == null || head.next == null) { head = null; return; }
        Node t = head;
        while (t.next.next != null) t = t.next;
        t.next = null;
    }

    void reverse() {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void print() {
        for (Node t = head; t != null; t = t.next)
            System.out.print(t.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLLStr ll = new SinglyLLStr();
        ll.addFirst("My"); 
        ll.addLast("Name");
        ll.addFirst("Sarvesh"); 
        
        ll.print();

        ll.delFirst(); 
       
        ll.print();
        ll.delLast(); 
       
        ll.print();
         ll.delLast(); 
       
        ll.reverse(); 
       
        ll.print();
    }
}