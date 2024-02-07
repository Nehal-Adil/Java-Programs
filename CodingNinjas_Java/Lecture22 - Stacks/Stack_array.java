package StacksAndQueues;

public class Stack_array {

    private int data[];
    private int topIndex;  // index of the top most element of the stack

    public Stack_array() {
        data = new int[10];
        topIndex = -1;
    }

    public Stack_array(int size) {
        data = new int[size];
        topIndex = -1;
    }

    // O(1)
    public int size() {
        return topIndex + 1;
    }

    // O(1)
    public boolean isEmpty() {
//        if (topIndex==-1){
//            return true;
//        }else {
//            return false;
//        }
        return topIndex == -1;
    }

    // O(1)
    public void push(int elem) throws StackFullException {
        // stack is full
        if (topIndex == data.length - 1) {
            // Throw Exception
//            StackFullException e = new StackFullException();
//            throw e;
//            throw new StackFullException();
            doubleCapacity();
        }

        topIndex++;
        data[topIndex] = elem;
    }

    // O(1)
    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            // Throw Exception
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    // O(1)
    public int pop() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = temp[i];
        }
    }


    public static void main(String[] args) throws StackFullException, StackEmptyException {

        Stack_array stack = new Stack_array();

        stack.push(10);
        stack.push(20);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.isEmpty());

        int arr[] = {5, 6, 7, 8, 9};

        for (int value : arr) {
            stack.push(value);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
