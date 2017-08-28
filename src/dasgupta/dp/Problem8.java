package dasgupta.dp;

/**
 * Created by seshasai on 17/08/2017.
 */
public class Problem8 {


    public static void main(String[] args){
        System.out.println(solution("abcdefgh","xyzdegpq"));
    }


    public static int solution(String str1, String str2){
        if(str1==null || str2==null || str1.length()==0 || str2.length()==0)
          return 0;

        int[][]sol = new int[str1.length()+1][str2.length()+1];
        int maxlen=0;

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    sol[i+1][j+1] = 1+ sol[i][j];
                    if(sol[i+1][j+1]>maxlen){
                        maxlen = sol[i+1][j+1];
                    }
                }
            }
        }
        return maxlen;
    }
}
