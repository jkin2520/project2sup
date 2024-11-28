public class Node {
    public Node left, right;
    public final int nodeID;
    public int data;
    private static int counter = 0;

    public Node(int data) {
        this.data = data;
        this.nodeID = counter++;
        this.left = null;
        this.right = null;
    }
}
