class MyStack {
    ArrayDeque<Integer> q1;
    int size;

    public MyStack() {
        q1 = new ArrayDeque<>();
        size = 0;
    }
    
    public void push(int x) {
        q1.offerLast(x);
        size++;
    }
    
    public int pop() {
        
        for(int i = 0; i < size - 1; i++) {
            int first = q1.pollFirst();
            q1.offerLast(first);
        }

        size--;
    
        return q1.pollFirst();
    }
    
    public int top() {
        int top = 0;

        for(int i = 0; i < size; i++) {
            top = q1.pollFirst();
            q1.offerLast(top);
        }

        return top;
    }
    
    public boolean empty() {
       return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */