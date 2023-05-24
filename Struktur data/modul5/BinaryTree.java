public class BinaryTree {
    public Node root;

    public void NewNode(int data) {
        root = NewNode(root,new Node(data));
    }

    private Node NewNode(Node root, Node newData){
        if (root == null){
            root = newData;
            return root;
        }
        if (newData.data < root.data){
            root.Left = NewNode(root.Left,newData);
        }else {
            root.Right = NewNode(root.Right,newData);
        }
        return root;
    }
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.Left);
            System.out.println(node.data + " ");
            inOrder(node.Right);
        }
    }
    public void preOrder(Node node) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.Left);
            preOrder(root.Right);
        }
    }
    public void postOrder(Node node) {
        if (root != null) {
            postOrder(root.Left);
            postOrder(root.Right);
            System.out.println(root.data);
        }
    }
}
