package Tree;
//package Trees;

public class TreeNode<T> {
	
	private final T value;
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;
    private TreeNode<T> parent;

    public TreeNode(T value) {
        this(value, null);
    }

    public TreeNode(T value, TreeNode<T> parent) {
        this.value = value;
        this.parent = parent;
        this.rightChild = null;
        this.leftChild = null;
    }

    public TreeNode<T> setParent(TreeNode<T> parent) {
        this.parent = parent;
        return this;
    }

    public TreeNode<T> getParent() {
        return this.parent;
    }

    public boolean hasParent() {
        return this.parent != null;
    }

    public TreeNode<T> setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
        return this;
    }

    public boolean hasLeftChild() {
        return this.leftChild != null;
    }
 
    public TreeNode<T> getLeftChild() {
        return this.leftChild;
    }

    public TreeNode<T> setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
        return this;
    }
    
    public boolean hasRightChild() {
        return this.rightChild != null;
    }

    public TreeNode<T> getRightChild() {
        return this.rightChild;
    }
    
    public boolean isLeaf() {
    	return (!this.hasLeftChild() && !this.hasRightChild());
    }

    public T getValue() {
        return this.value;
    }
    
    public String toString() {
    	return "(" + this.value + ")";
    }
}
