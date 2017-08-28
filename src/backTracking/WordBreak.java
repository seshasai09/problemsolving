package backTracking;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vasumathi on 20/08/2017.
 */
public class WordBreak {

    public static  Set<String> dict = new HashSet<String>();

    public WordBreak(){
        dict.add("I");
        dict.add("In");
        dict.add("have");
        dict.add("Jain");
        dict.add("Sumit");
        dict.add("am");
        dict.add("this");
        dict.add("dog");
    }
    int x =5;

    public boolean isWord(String word, String ans){
        if(word==null|| word=="" || word.length()==0){
            System.out.println(ans);
            return true;
        }


        for(int i=0;i<word.length()+1;i++){

            if(dict.contains(word.substring(0,i))){
                if( isWord(word.substring(i),ans +" "+ word.substring(0,i)))
                    return true;
                else
                    continue;
            }
        }
        return false;
    }

    public static void main(String[] args){
        /*WordBreak wb = new WordBreak();
        wb.isWord("thisamSumit","")*/;
        int i=1;
        int k = i =5;
       System.out.println(String.format("%tT",Calendar.getInstance()));

    }
}
