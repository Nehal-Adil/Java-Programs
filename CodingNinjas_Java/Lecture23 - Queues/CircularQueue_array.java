package StacksAndQueues;

public class CircularQueue_array {

    private static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // Queue Constructor
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //Enqueue
        static void add(int data) {
            if (isFull()) {
                System.out.println("full queue");
                return;
            }
            // add 1st element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //Dequeue - O(1)
        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            // single element condition
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek - O(1)
        static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            q.remove();
            q.add(6);
            q.remove();
            q.add(7);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
