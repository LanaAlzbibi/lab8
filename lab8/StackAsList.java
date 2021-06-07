import java.util.EmptyStackException;

public class StackAsList<T> implements Stack<T> {
    private Node first;
    private long size = 0;
    private Integer maxSize; // to check overflow

    // Constructor
    public StackAsList() {
        first = null;
        maxSize = 5; // maximum number of nodes
    }

    private class Node {
        public T data;
        public Node next;
    }

    // returns the size of the LinkedList
    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty stack";
        }
        return String.format("Stack size %s: top value %s", size, this.first.data);
    }
    
    // adds Nodes to the LinkedList
    public void push(T e){
        if (size > maxSize) throw new StackOverflowError();
        Node newNode = new Node();
        newNode.data = e;
        newNode.next = first;
        first = newNode;
        size += 1;
    }

    // checks if the first Node is empty
    public boolean isEmpty(){
        return (first == null);
    }

    // returns the value of the last Node and removes it from the list
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T data = first.data;
        first = first.next;
        size -= 1;
        return data;
    }

    // returns the value of the last Node
    public T peek() {
        if (isEmpty()) return null;

        return first.data;
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new StackAsList<Integer>();
        stack.push(5);
        stack.push(3);
        System.out.print(stack.toString());
    }
}