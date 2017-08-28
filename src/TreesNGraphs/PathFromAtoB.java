package TreesNGraphs;

import java.util.Set;

/**
 * Created by vasumathi on 10/08/2017.
 */
public class PathFromAtoB {

    boolean routeFound = false;

    private boolean rootExists(Node src, Node dest, Set<Node> visited){

        visited.add(src);
        for(Node neighbour : src.neighbours){
            if(neighbour==dest){
                routeFound = true;
                return true;
            }else{
                if(!visited.contains(neighbour) && !routeFound){
                    rootExists( neighbour,  dest,visited)  ;
                }
            }
        }
        return routeFound;
    }
}
