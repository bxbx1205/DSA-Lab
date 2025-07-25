package LAB2;

import java.util.Scanner;



public class LinkedListNode {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;

            return;
        }
        Node last = head;
        while (last.next != null) {
            if (last.next.data == data) {
                last.next = last.next.next;
                return;
            }   
            last = last.next;
        }
    }

    public void printList() {
        Node curr = head;
        System.out.print("LinkedList: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to add to the list (-1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            list.insert(num);
        }
        list.printList();

        System.out.println("Enter a number to remove from the list:");
        int removeNum = sc.nextInt();
        list.remove(removeNum);
        list.printList();
        sc.close();
    }
}
