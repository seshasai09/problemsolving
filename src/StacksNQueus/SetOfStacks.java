package StacksNQueus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class SetOfStacks {

    private List<Stack> setOfStacks;
    private int index;
    private final int MAX_SIZE = 5;

    public SetOfStacks(){
        setOfStacks = new ArrayList<Stack>();
        index=0;
        setOfStacks.add(new Stack(MAX_SIZE));
    }

    public void push(int val) throws Exception{

        if(setOfStacks.get(index).stack.size()==MAX_SIZE){
            index++;
            Stack st = new Stack(MAX_SIZE);
            st.push(val);
            setOfStacks.add(index,st);
            return ;
        }

        setOfStacks.get(index).push(val);
    }

    public int pop(){
        if(setOfStacks.get(index).stack.size()==0){
            index--;
        }

        return setOfStacks.get(index).pop();
    }

}
