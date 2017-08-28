package recursion;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Problem5 {

    public void solution(String input, String sol){
        if(input=="" || input.length()==0){
            System.out.println(sol);
            return;
        }
        for(int i=0;i<input.length();i++)
            solution(input.substring(0,i)+input.substring(i+1),sol+input.charAt(i));
    }

    public static void main(String[] args){
        Problem5 pb = new Problem5();
        pb.solution("((()))","");
    }
}
