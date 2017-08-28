package dasgupta.dp;

/**
 * Created by seshasai on 17/08/2017.
 */
public class Problem13 {

    public static int solution(int []cards){
        int [][]sol = new int [cards.length+1][cards.length+1];
        for(int l=2;l<cards.length;l+=2){
            for(int i=0;i<cards.length-l+1;i++){
                int j=i+l-1;
                sol[i][j]=Math.max(cards[i]+Math.min(sol[i-1][j-1]-cards[j],sol[i-2][j]-cards[i+1]),
                        cards[j] + Math.min(sol[i-1][j-1]-cards[i],sol[i-1][j-2]-cards[j]));
            }
        }
        return sol[cards.length][cards.length];
    }
}
