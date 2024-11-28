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
    public void insert(int value) {
        if (value < this.data) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
            } else {
                this.right.insert(value);
            }
        }
    }
    
}
