package dasgupta.dp;

/**
 * Created by Seshasai on 13/08/2017.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *You are going on a long trip. You start on the road at mile post 0.
 *  Along the way there are n hotels, at mileposts a1 < a2 < ··· < an,
 *  where each ai is measured from the starting point.
 *  The only places you are allowed to stop are at these hotels, but you can choose which of the hotels you stop at.
 *  You must stop at the ﬁnal hotel(at distance an),which is your destination.
 *
 *  You’d ideally like to travel 200 miles a day, but this may not be possible(depending on the spacing of the hotels).
 *  If you travel x miles during a day,the penalty for that dayi s (200−x)2.
 *  You want to plan your trip so as to minimize the total penalty—that is,the sum,over all travel days,of the daily penalties.
 *  Give an efﬁcient algorithm that determines the minimum cost
 */


public class Problem2 {

    public static void main(String[] args){

        int input[] = {0, 200, 400, 600, 601};
         solution(input);


    }

    public static void solution(int[] input){
        int cost[] = new int[input.length+1];
        List<Integer> sol = new ArrayList<Integer>();
        for(int i=1;i<cost.length;i++)
            cost[i] = Integer.MAX_VALUE;

        cost[0]=0;
        cost[1] = (200-input[0])*(200-input[0]);
        sol.add(0,0);
        for(int i=1;i<input.length;i++){
            for(int j=0;j<i;j++){
                int d= input[i]-input[j];
                if((200-d)*(200-d)+cost[j]<cost[i+1]){

                    cost[i+1] = (200-d)*(200-d)+cost[j];
                }

            }
        }
        System.out.println(cost[cost.length-1]);

    }
}
