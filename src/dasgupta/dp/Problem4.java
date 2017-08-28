package dasgupta.dp;

import java.util.Set;

/**
 * Created by vasumathi on 13/08/2017.
 */
public class Problem4 {

    public static void main(String[] args){

    }

    public static void solution(String input, Set<String> dict){
        boolean [] sol = new boolean[input.length()];
        sol[0]= true;
        sol[1] = dict.contains(input.substring(0,2));
        for(int i=2;i<input.length();i++){
            for(int j=1;j<i;j++){
                if(sol[j-1] && dict.contains(input.substring(j,i+1))){
                    sol[i] = true;
                }
            }
        }
        System.out.println(sol[input.length()-1]);
    }
}
