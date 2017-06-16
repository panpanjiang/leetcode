package easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q=new MyQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.peek());
		q.pop();
		q.push(7);
		System.out.println(q.peek());
		System.out.println(q.empty());
		q.pop();
		q.pop();
		q.pop();
		System.out.println(q.empty());
	}
	
}

class MyQueue {
    Stack s1=new Stack();
    Stack s2=new Stack();
    int front;
    // Push element x to the back of queue.
    public void push(int x) {
        if(s1.isEmpty()){
        	front=x;
        }
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!s1.isEmpty()){
        	s2.push(s1.pop());
        }
        s2.pop();
        if(!s2.isEmpty()){
        	front=(int)s2.peek();
        }        
        while(!s2.isEmpty()){
        	s1.push(s2.pop());
        }
    }

    // Get the front element.
    public int peek() {
        return front;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty();
    }
}
