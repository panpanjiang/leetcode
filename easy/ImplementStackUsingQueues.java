package easy;

import java.util.ArrayList;
import java.util.LinkedList;  
import java.util.Queue; 

public class ImplementStackUsingQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyStack {
	Queue<Integer> q1=new LinkedList<Integer>();		
    // Push element x onto stack.
    public void push(int x) {  
    	Queue<Integer> temp=new LinkedList<Integer>();
    	temp.add(x);
    	while(!q1.isEmpty())
    		temp.add(q1.poll());
    	q1=temp;
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}