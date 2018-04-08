package Stacks;

public class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return (1 + t);
    }

    @Override
    public boolean isEmpty() {
        return (t == -1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) {
            throw new IllegalStateException("Stack is Full");
        }
        data[++t] = e;
    }
    
    public E top(){
        if(isEmpty())return null;
        return data[t];
    }
    
    public E pop(){
        if(isEmpty())return null;
        E temp = data[t];
        t--;
        return temp;
    }

}
