package TreesNGraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasumathi on 10/08/2017.
 */
public class TreeTraversal {


    public boolean isBst(Tree root){
        if(root==null)
            return true;
        return isBst(root, Long.MIN_VALUE,Long.MAX_VALUE );
    }


    private boolean isBst(Tree root, long min, long max){
        if(root==null)
            return true;
        if(root.val<min || root.val>max)
            return false;
        return isBst(root.left,min,root.val) && isBst(root.right,root.val, max);
    }

    public Tree LowestCommonAnsistor(Tree root, Tree p, Tree q){
        if(root==null)
            return root;
        if(p==root || q==root){
            return root;
        }
        Tree left = LowestCommonAnsistor(root.left,p,q);
        Tree right = LowestCommonAnsistor(root.right,p,q);
        if(left!=null && right!=null)
            return root;
        return left==null?right:left;
    }

    public boolean isSubTree(Tree t, Tree s){
        if(t==null && s!=null)
            return false;
        if(t!=null && s== null)
            return false;
        if(t.val==s.val){
            if( isSubTree(t.left,s.left) && isSubTree(t.right,s.right))
                return true;
        }
        return isSubTree(t.left,s) || isSubTree(t.right,s);

    }

    /*public List<List<Integer>> pathSum(Tree root, int sum){
        if(root==null)
            return new ArrayList<List<Integer>>();
        return pathSum(root, sum,new ArrayList<List<Integer>>(),null );
    }*/

   /* private List<List<Integer>> pathSum(Tree root, int sum,List<List<Integer>> sol,List<Integer> subSol){
        if(root==null)
            return sol;
        if(sum==0)
            sol.add(subSol);
        includeRoot(root.left, sum-root.val,sol,null);
        doNotIncludeRoot(root.left, sum,sol,null);

    }
    private List<List<Integer>> includeRoot(Tree root, int sum,List<List<Integer>> sol,List<Integer> subSol){
        if(root==null)
            return sol;
        if(sum==0)
            sol.add(subSol);
        includeRoot(root.left, sum-root.val,sol,null);
        doNotIncludeRoot(root.left, sum-root.val,sol,null);

    }*/


    public List<List<Integer>> nodesAtLevel(Tree root){
        if(root == null)
            return new ArrayList<List<Integer>>();
        return nodesAtLevel(root, new ArrayList<List<Integer>>(), 0);
    }

    private List<List<Integer>> nodesAtLevel(Tree root,List<List<Integer>> sol, int level){
        if(root== null)
            return sol;
        if(sol.size()-1<level){
            sol.add(level, new ArrayList<Integer>());
            sol.get(level).add(root.val);
        }else{
            sol.get(level).add(root.val);;
        }

        nodesAtLevel(root.left,sol,level+1);
        nodesAtLevel(root.right,sol,level+1);
        return sol;
    }
}
