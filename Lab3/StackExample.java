
package Lab3;
import java.util.Scanner;



    public class StackExample {
        int[] stack;
        int top = -1;
        int maxSize;

        public StackExample(int size) {
            maxSize = size;
            stack = new int[size];
        }

        void push(int value) {
            if (top < maxSize - 1) {
                stack[++top] = value;
                System.out.println("Pushed: " + value);
            } else {
                System.out.println("Stack overflow");
            }
        }

        int pop() {
            if (top >= 0) {
                int value = stack[top--];
                System.out.println("Popped: " + value);
                return value;
            } else {
                System.out.println("Stack underflow");
                return -1;
            }
        }

        int peek() {
            if (top >= 0) {
                return stack[top];
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        boolean isEmpty() {
            return top == -1;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack elements: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(stack[i] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the size of stack: ");
            int size = scanner.nextInt();
            
            StackExample s = new StackExample(size);
            
            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        int value = scanner.nextInt();
                        s.push(value);
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        int topElement = s.peek();
                        if (topElement != -1) {
                            System.out.println("Top element: " + topElement);
                        }
                        break;
                    case 4:
                        s.display();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
