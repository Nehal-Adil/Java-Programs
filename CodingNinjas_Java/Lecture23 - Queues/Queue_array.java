package StacksAndQueues;

public class Queue_array {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front =-1;

        // Queue Constructor
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        static boolean isFull() {
            return (rear+1) % size == front;
        }

        //Enqueue
        static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        //Dequeue - O(n)
        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek - O(n)
        static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
