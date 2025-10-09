package ArvoreRubroNegra;

public class Node {
    public int key;
    public Node right;
    public Node left;
    public Node parent;
    public Color color;

    public Node(int key) {
        this.key = key;
    }
}
