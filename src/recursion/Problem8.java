package recursion;

/**
 * Created by vasumathi on 20/08/2017.
 */
public class Problem8 {

    int count = 0;
    public int solution(int n){
        if(n<0)
            return 0;
        if(n<5)
            return 1;
        if(n>=5 && n<10)
            return solution(n-5) + solution(n-1);
        if(n>=10 && n<25)
            return  solution(n-10) + solution(n-5) + solution(n-1);

            return solution(n-25) + solution(n-10) + solution(n-5) + solution(n-1);

    }

    public static void main(String[] args){
        Problem8 pb = new Problem8();
        System.out.println(pb.solution(6));
    }
}
