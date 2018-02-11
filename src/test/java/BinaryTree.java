/**
 * Created by jyp on 2017/12/17.
 */
public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {

        return root;
    }

    //clear
    public void clear(BinaryTreeNode node) {
        if (node != null) {
            clear(node.getLeftChild());
            clear(node.getRightChild());
            node = null;
        }
    }

    //clear root
    public void clear() {
        clear(root);
    }

    //
    public boolean isEmpty() {
        return root == null;
    }

    //求二叉树的高度
    public int height() {
        return height(root);
    }

    public int height(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int l = height(node.getLeftChild());
            int r = height(node.getRightChild());
            return l < r ? r + 1 : l + 1;
        }
    }

    //获取二叉树的总节点数
    public int size() {
        return size(root);
    }

    public int size(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.getLeftChild()) + size(node.getRightChild());
        }
    }

    //先根遍历
    public void preOrder(BinaryTreeNode node){
        if (node != null) {
            System.out.println(node.getData());
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    //中跟遍历
    public void inOrder(BinaryTreeNode node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            System.out.println(node.getData());
            inOrder(node.getRightChild());
        }
    }
    //后根遍历
    public void postOrder(BinaryTreeNode node){
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.println(node.getData());
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
        BinaryTreeNode binaryTreeNodeLeft = new BinaryTreeNode();
        binaryTreeNodeLeft.setData(1);
        BinaryTreeNode binaryTreeNodeRight = new BinaryTreeNode();
        binaryTreeNodeRight.setData(1);
        binaryTreeNode.setData(0);
        binaryTreeNode.setLeftChild(binaryTreeNodeLeft);
        binaryTreeNode.setRightChild(binaryTreeNodeRight);
        binaryTree.setRoot(binaryTreeNode);

        System.out.println(binaryTree.size());
        System.out.println(binaryTree.height());

        System.out.println("先序遍历");
        binaryTree.preOrder(binaryTreeNode);
        System.out.println("中序遍历");
        binaryTree.inOrder(binaryTreeNode);
        System.out.println("后序遍历");
        binaryTree.postOrder(binaryTreeNode);

    }


}
