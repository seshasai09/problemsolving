package TreesNGraphs;

/**
 * Created by vasumathi on 10/08/2017.
 */
public class BalancedBinaryTree {

    public class TreeData{
        int height;
        boolean isBalanced;
        public TreeData(int height, boolean isBalanced){
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public boolean isTreeBalanced(Tree root){

        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        TreeData data =  isTreeBalanced(root,0);

        return  data.isBalanced;
    }

    public TreeData isTreeBalanced(Tree root, int height){
        if(root==null){
            return new TreeData(height,true);
        }

        TreeData left = isTreeBalanced(root.left, height+1);
        TreeData right = isTreeBalanced(root.right, height+1);
        if(Math.abs(left.height-right.height)<=1)
            return  new TreeData(left.height>right.height?left.height:right.height,true);

        return  new TreeData(left.height>right.height?left.height:right .height,false);
    }
}
