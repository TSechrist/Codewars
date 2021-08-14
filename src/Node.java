import java.util.LinkedList;
import java.util.Queue;

class Node {
    private Node leftChild, rightChild;

    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {

        //Base case for bottom of tree selected
        if (this.leftChild == null && this.rightChild == null){
            return 0;
        }

        //Use a queue to keep track of where we are at
        Queue<Node> q = new LinkedList<Node>();

        int h = 0;
        q.add(this);

        //Counting the nulls in our queue to see how deep we go in our height
        q.add(null);

        //Driver for our method.
        while(!q.isEmpty()){
            //Removing the first node in our queue to check where we are in tree
            Node node = q.remove();

            //If the node is null then we are at a new level in our tree
            if (node == null) {
                if(!q.isEmpty()){
                    q.add(null);
                }
                h++;
            }
            //If the node is not null, then we add the next child to the queue
            else {
                if (node.rightChild != null){
                    q.add(node.rightChild);
                }
                if (node.leftChild != null){
                    q.add(node.leftChild);
                }
            }
        }
        return h - 1;


//        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}