package StacksNQueus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class Stack {

    List<Integer> stack;
    int maxSize;

    public Stack(int size){
        stack = new ArrayList<>();
        maxSize = size;
    }

    public void push(int val){
        stack.add(val);
    }

    public int pop(){
        int val = stack.get(0);
        stack.remove(0);
        return val;
    }

    public int peek(){
        return stack.get(0);
    }

}
