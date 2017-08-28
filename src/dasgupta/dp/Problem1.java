package dasgupta.dp;

/**
 * Created by Seshasai on 13/08/2017.
 */

/**
 *  A contiguous subsequence of a list S is a subsequence made up of consecutive elements of S.
 *  For instance,if S is 5,15,−30,10,−5,40,10, then 15,−30,10is a contiguous subsequence but 5,15,40 is not.
 *  Give a linear-time algorithm for the following task:
 *  Input: A list of numbers, a1,a2,...,an.
 *  Output: The contiguous subsequence of maximumsum (a subsequence of length zero has sumz ero).
 *  For the preceding example,the answer would be 10,−5,40,10,with a sumof 55.
 *  (Hint: Foreach j ∈{1,2,...,n},consider contiguous subsequences ending exactly at position j.)
 */

public class Problem1 {

    public static void main(String args[]){

        int input1[] = new int[]{5,15,-30,10-5,40,10};
        System.out.println(MaximumsumSubSeq(input1));

    }

    public static int MaximumsumSubSeq(int[] input){

        int sol[] = new int[input.length];
        sol[0]=input[0];
        for(int i=1;i<input.length;i++){
            if(sol[i-1]+input[i]>0){
                sol[i] = sol[i-1] + input[i];
            }else{
                sol[i]=0;
            }
        }
        return sol[input.length-1];
    }
}
