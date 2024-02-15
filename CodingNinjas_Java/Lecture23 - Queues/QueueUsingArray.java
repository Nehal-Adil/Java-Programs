package StacksAndQueues;

public class QueueUsingArray {
    private int data[];
    int front;
    int rear;
    int size;

    public QueueUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    // O(1)
    public int size() {
        return size;
    }

    // O(1)
    public boolean isEmpty() {

        return size == 0;
    }

    // O(1)
    public void enqueue(int element) {
        if (size == data.length) {
//            throw new QueueFullException();
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
//        rear++;
//        if (rear==data.length){
//            rear=0;
//        }

        rear = (rear + 1) % data.length;

        data[rear] = element;
        size++;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];

        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        for (int i = 0; i < front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length-1;
    }

    // O(1)
    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    // O(1)
    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        if (front == data.length) {
            front = 0;
        }
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(4);
        int arr[] = {10, 20, 30, 40, 50, 60};

        for (int value : arr) {
            queue.enqueue(value);

        }

        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException ignored) {

            }
        }
    }
}
