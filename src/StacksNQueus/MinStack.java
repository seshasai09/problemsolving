package StacksNQueus;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class MinStack {

    private List<Integer> stack;
    private int minVal = Integer.MAX_VALUE;
    private PriorityQueue<Integer> queue;

    public MinStack(){
        stack = new ArrayList<Integer>();
        queue = new PriorityQueue<Integer>();
    }

    public void push(Integer val){
        queue.add(val);
        if(val<minVal){
            minVal = val;
        }
        stack.add(val);
    }

    public Integer pop() throws Exception{
        if(stack.size()>0){
            int val = stack.get(0);
            queue.remove(new Integer(val));
            stack.remove(0);
            return val;
        }
        else
        throw new Exception("Stack is empty");
    }

    public int getMin() throws Exception{
        if(stack.size()>0) {
            minVal = queue.peek();
            return minVal;
        }
        else
            throw new Exception("Stack is empty");
    }

    public void printStack(){
        System.out.println("printin stack");
        for(int i : stack){
            System.out.println(i);
        }
    }
    public void printQueue(){
        System.out.println("printin queue");
        for(int i : queue){
            System.out.println(i);
        }
    }
}
