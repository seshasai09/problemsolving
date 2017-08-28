package dasgupta.dp;

/**
 * Created by Seshasai on 13/08/2017.
 */

/**
 *  Yuckdonald’s is considering opening a series of restaurants along QuaintValleyHighway(QVH).
 *  The n possible locations are along a straight line, and the distances of these locations from the start of QVHare,
 *  in miles and inincreasing order,m1,m2,...,mn. The constraints are as follows: • At each location,
 *  Yuckdonald’s may open at most one restaurant.
 *  The expected proﬁt from opening arestaurant at location i is pi,where pi > 0 and i = 1,2,...,n.
 *  • Any two restaurants should be atleast k miles apart,where k is a positive integer.
 */

public class Problem3 {

    public static void main(String[] args){

    }

    public static void solution(int[] input,int[] ep, int dist){
        int profit[][]= new int[input.length+1][];

        for(int i=1;i<input.length;i++){
            for(int j=0;j<i;j++){
                if(input[i]-input[j]>=dist){
                    profit[i][j] = Math.max(profit[i-1][j-1]+ep[j],profit[i][j]);
                }
            }
        }
    }
}
