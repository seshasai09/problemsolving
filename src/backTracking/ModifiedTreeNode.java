package backTracking;

/**
 * Created by vasumathi on 20/08/2017.
 */
public class ModifiedTreeNode {

    ModifiedTreeNode left;
    ModifiedTreeNode right;
    boolean isGoal;
    public ModifiedTreeNode(ModifiedTreeNode left, ModifiedTreeNode right, boolean isGoal){
        this.left = left;
        this.right = right;
        this.isGoal = isGoal;
    }
}
