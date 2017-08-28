package dasgupta.dp;

/**
 * Created by seshasai on 17/08/2017.
 */
public class Problem11 {


    public static void main(String[] args){
        System.out.println(solution("abcdef","xyzafbpecd"));
    }

    public static int solution(String str1, String str2){
        int[][]sol = new int[str1.length()+1][str2.length()+1];

        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    sol[i][j] = 1+sol[i-1][j-1];
                }else{
                    sol[i][j] = Math.max(sol[i-1][j], sol[i][j-1]);
                }
            }
        }
        return sol[str1.length()][str2.length()];

    }
}
