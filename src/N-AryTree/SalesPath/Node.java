package Pramp.SalesPath;

class Node {
    int cost;
    Node[] children;

    Node(int cost) {
        this.cost = cost;
        children = null;
    }
}
