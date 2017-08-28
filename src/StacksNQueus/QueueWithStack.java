package StacksNQueus;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class QueueWithStack {

    private Stack stack1;
    private Stack stack2;
    int index=0;

    public QueueWithStack(){
        stack1 = new Stack(10);
        stack2 = new Stack(10);

    }

    public boolean enqueue(int val){
        stack1.push(val);
        return true;
    }

    public int dequeue(){

        while(stack1.stack.size()!=0){
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while(stack2.stack.size()!=0){
            stack1.push(stack2.pop());
        }
        return val;
    }

    public int size(){
        return stack1.stack.size();
    }
}
