package recursion;

/**
 * Created by vasumathi on 20/08/2017.
 */
public class Problem4 {

    public void solution(String input, String subset, int i){
        if(input=="" || input.length()==0 || i>=input.length()) {
            System.out.println(subset+" sol");
            return ;
        }
       // for(int i=0;i<input.length();i++){
            solution(input,subset+input.charAt(i),i+1);
            solution(input,subset,i+1);
     //   }
    }

    public static void main(String[] args){
        Problem4 pb = new Problem4();
        pb.solution("1234","",0);
    }
}

