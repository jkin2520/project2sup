public class Node {
    public Node left, right;
    public final int nodeID;
    public int data;
    private static int counter = 0;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.nodeID = counter++;
        this.left = null;
        this.right = null;
    }

    // Insert Method
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
    // Dump method
    public String dump(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t".repeat(level))
          .append("Node ID: ").append(nodeID)
          .append(", Data: ").append(data).append("\n");
        if (this.left != null) sb.append(this.left.dump(level + 1));
        if (this.right != null) sb.append(this.right.dump(level + 1));
        return sb.toString();
    }
    
    
    
    
}
