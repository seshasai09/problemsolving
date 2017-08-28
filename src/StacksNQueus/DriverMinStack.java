package StacksNQueus;

import java.util.Random;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class DriverMinStack {

    public static void main(String[] args) throws Exception{
        MinStack ms = new MinStack();
        Random ran = new Random();
      //  ran.ints(1,10);
        for(int i=0;i<10;i++){
            ms.push(ran.nextInt(10));
        }
        ms.printStack();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.printStack();
        ms.printQueue();
        System.out.println(ms.getMin());
    }
}
