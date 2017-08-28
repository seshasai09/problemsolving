package recursion;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class Problem3 {

    public void solution(int [] input, int start, int end){
        if(start<=end) {
            int mid = (start + end) / 2;
            if (mid == input[mid]) {
                System.out.println(mid);
                return;
            }
            if (input[mid] < mid) {
                solution(input, mid + 1, end);
            } else {
                solution(input, start, mid - 1);
            }
        }

    }

    public static void main(String[] args){
        Problem3 pb = new Problem3();
        int [] input = {-1,0,1,2,5,10};
        pb.solution(input,0,6);
    }
}
