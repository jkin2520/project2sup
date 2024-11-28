import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NodeTest {

    @Test
    public void testInsert() {
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);

        assertNotNull(root.left);
        assertNotNull(root.right);
        assertEquals(5, root.left.data);
        assertEquals(15, root.right.data);
    }

    @Test
    public void testDump() {
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);

        String expected = """
            Node ID: 0, Data: 10
            	Node ID: 1, Data: 5
            	Node ID: 2, Data: 15
            """;
        assertEquals(expected.strip(), root.dump(0).strip());
    }
}
