package dasgupta.dp;

/**
 * Created by seshasai on 17/08/2017.
 */
public class Problem10 {

    public static void main(String[] args){
        double[] p = {0.1,0.5,0.6,0.2};
        System.out.println(solution(4,2,p));
    }

    public static double solution(int n, int k, double[] p){
        double sol[][] = new double[n+1][k+1];
        sol[0][0]= 1.0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                sol[i][j] = p[i-1]*sol[i-1][j-1] + (1-p[i-1])*sol[i-1][j];
                System.out.println(sol[i][j]);
            }
        }
        return sol[n][k];
    }
}
