package recursion;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Problem1 {

    public int solution(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 1 + solution(n-1);
        if(n==3)
            return 1 + solution(n-1) + solution(n-2);
        return solution(n-3) + solution(n-2) + solution(n-1);
    }

    public static void main(String[] args){
        Problem1 pb = new Problem1();
        System.out.println(pb.solution(4));
    }
}
