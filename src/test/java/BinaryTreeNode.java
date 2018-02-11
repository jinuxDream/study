/**
 * Created by jyp on 2017/12/17.
 */
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {

        return data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;

    }
}
