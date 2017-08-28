package recursion;

/**
 * Created by vasumathi on 20/08/2017.
 */
public class Problem6 {

    public void solution(int n, String sol,int o, int c ){
        if(c==n){
            System.out.println(sol);
            return;
        }
        if(o>c){
            solution(n,sol+")",o,c+1);
        }
        if(o<n){
            solution(n,sol+"(",o+1,c);
        }
    }

    public static void main(String[] args){
        Problem6 pb = new Problem6();
        pb.solution(3,"",0,0);
    }
}
