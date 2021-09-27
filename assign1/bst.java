public class bst {
    class Node{
        int key;
        Node left,right;
        public Node(int data){
            key=data;
            left=right=null;
        }
    }
    Node root;
    bst(){
        root=null;
    }
  public void insert( int data){
        root=helperInsert(root,data);
  }
    private Node helperInsert(Node root, int data) {
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data < root.key){
            root.left=helperInsert(root.left,data);
        }
        else {
            root.right=helperInsert(root.right,data);
        }
        return root;
    }
    public Node Search(Node root, int data)
    {
        if (root==null || root.key==data)
            return root;
        if (root.key < data)
            return Search(root.right, data);
        return Search(root.left, data);
    }
     public void checkAlltraversals(){
         System.out.println(" preorder traversal of the BST"  + " ");
        preOrder(root);
        System.out.println();
         System.out.println(" inorder traversal of the BST"  + " ");
        inOrder(root);
         System.out.println();
         System.out.println(" postorder traversal of the BST"  + " ");
        postOrder(root);
         System.out.println();
     }
   
    public void preOrder(Node root){
        if(root==null) return;
        else {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public void inOrder(Node root){
        if(root==null) return;
        else {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root==null) return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
bst tree=new bst();
tree.insert(1);
tree.insert(2);
tree.insert(39);
tree.insert(4);
tree.insert(9);
tree.insert(6);
tree.insert(1111999);
tree.checkAlltraversals();
}
}