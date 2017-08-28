package recursion;

import java.util.Date;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Problem2 {

    public int solution(int x , int y){
        if(x==1||y==1)
            return 1;
        return solution(x,y-1) + solution(x-1,y);
    }

    public static void main(String [] args){
        Problem2 pb = new Problem2();
        Date dt = new Date();
        System.out.println(dt.getSeconds());
        System.out.println(pb.solution(20,20));
        System.out.println(dt.getSeconds());
    }

    public int solution2(int x, int y){
        int [][] sol = new int[x][y];
        for(int i=0;i<x;i++)
            sol[i][0]=1;
        for(int i=0;i<y;i++)
            sol[0][i]=1;
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                sol[i][j] = sol[i-1][j] + sol[i][j-1];
            }
        }
        return sol[x-1][y-1];
    }
}
