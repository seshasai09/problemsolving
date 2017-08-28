package dasgupta.dp;

/**
 * Created by vasumathi on 13/08/2017.
 */
public class Problem7 {

    public static void main(String[] args){

    }

    public static void solution(String str){
        int[][]sol = new int[str.length()][];
        for(int i=0;i<sol.length;i++){
            sol[i][i]=1;
        }
        for(int l=1;l<str.length();l++){
            for(int i=0;i<str.length()-l+1;i++){
                int j=i+l-1;
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    sol[i][j] = sol[i-1][j-1]+2;
                }else if(i!=j && str.charAt(i) != str.charAt(j)){
                 sol[i][j] = Math.max(sol[i+1][j],sol[i][j-1]);
                }
            }
        }
    }
}
