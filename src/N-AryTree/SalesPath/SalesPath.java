package Pramp.SalesPath;

public class SalesPath {

    int getCheapestCost(Node rootNode) {
        int min = Integer.MAX_VALUE;
        if(rootNode.children == null)
            return rootNode.cost;

        for(int i=0; i<rootNode.children.length; i++)
        {
            int total = rootNode.cost + getCheapestCost(rootNode.children[i]);
            min = Math.min(min, total);
        }
        return min;
    }
}
