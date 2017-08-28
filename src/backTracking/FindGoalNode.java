package backTracking;

/**
 * Created by vasumathi on 20/08/2017.
 */
public class FindGoalNode {

    public static void main(String args[]){
        ModifiedTreeNode c = new ModifiedTreeNode(null, null, false);
        ModifiedTreeNode d = new ModifiedTreeNode(null, null, false);
        ModifiedTreeNode e = new ModifiedTreeNode(null, null, true);
        ModifiedTreeNode f = new ModifiedTreeNode(null, null, false);
        ModifiedTreeNode a = new ModifiedTreeNode(c, d, false);
        ModifiedTreeNode b = new ModifiedTreeNode(e, f, false);
        ModifiedTreeNode r = new ModifiedTreeNode(a, b, false);
        FindGoalNode sn = new FindGoalNode();
        System.out.println(sn.solution(r));
    }


    public boolean solution(ModifiedTreeNode root){
        if(root== null)
            return false;
        if(root.left == null && root.right==null && root.isGoal){
            System.out.println("solution found");
            return true;
        }
        return solution(root.left)||solution(root.right);

    }
}
