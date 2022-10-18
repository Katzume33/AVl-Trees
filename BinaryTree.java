package Tree;


import java.util.ArrayList;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BinaryTree<T> {

protected TreeNode<T> root;
	

	public List<T> traverse() {
		List<T> result = new ArrayList<>();
		return result;
	}

	public TreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(TreeNode<T> root) {
		this.root = root;
	}

	public String toString() {

		List<T> result1 = recursivePreorderTraversal();
		return result1.toString();

	}
	

	
	public List<T> recursivePreorderTraversal() {
		List<T> result  = new ArrayList<>();
		recursivePreorderTraversal (this.root,result);
		return result;
		
	}

	public void recursivePreorderTraversal(TreeNode<T> current,List<T> list) {
		//1. process the current node
		list.add(current.getValue());
		//2. recursively call method on the current's left
		if (current.hasLeftChild()) {
			recursivePreorderTraversal(current.getLeftChild(),list);
		}
		//3. recursively call method on the current's right
		if(current.hasRightChild()) {
			recursivePreorderTraversal(current.getRightChild(),list);
		}
	}
	
	
	
	public static void main(String args[]) {
		BinaryTree<String> t = new BinaryTree<>();
		Map<String, TreeNode<String>> m = new HashMap<>();
		for (Character c = 'a'; c <= 'r'; c++) {
			m.put(c.toString(), new TreeNode<>(c.toString()));
		}
		t.root = m.get("a");
		m.get("a").setParent(null).setLeftChild(m.get("b")).setRightChild(m.get("c"));
		m.get("b").setParent(m.get("a")).setLeftChild(m.get("d")).setRightChild(m.get("e"));
		m.get("c").setParent(m.get("a")).setLeftChild(null).setRightChild(m.get("f"));
		m.get("d").setParent(m.get("b")).setLeftChild(m.get("g")).setRightChild(m.get("h"));
		m.get("e").setParent(m.get("b")).setLeftChild(null).setRightChild(m.get("i"));
		m.get("f").setParent(m.get("c")).setLeftChild(m.get("j")).setRightChild(m.get("k"));
		m.get("g").setParent(m.get("d")).setLeftChild(m.get("l")).setRightChild(m.get("m"));
		m.get("h").setParent(m.get("d")).setLeftChild(null).setRightChild(m.get("n"));
		m.get("i").setParent(m.get("e")).setLeftChild(m.get("o")).setRightChild(null);
		m.get("j").setParent(m.get("f")).setLeftChild(m.get("p")).setRightChild(m.get("q"));
		m.get("k").setParent(m.get("f")).setLeftChild(null).setRightChild(null);
		m.get("l").setParent(m.get("g")).setLeftChild(null).setRightChild(null);
		m.get("m").setParent(m.get("g")).setLeftChild(m.get("r")).setRightChild(null);
		m.get("n").setParent(m.get("h")).setLeftChild(null).setRightChild(null);
		m.get("o").setParent(m.get("i")).setLeftChild(null).setRightChild(null);
		m.get("p").setParent(m.get("j")).setLeftChild(null).setRightChild(null);
		m.get("q").setParent(m.get("j")).setLeftChild(null).setRightChild(null);
		m.get("r").setParent(m.get("m")).setLeftChild(null).setRightChild(null);
		//preorder: [a, b, d, g, l, m, r, h, n, e, i, o, c, f, j, p, q, k]
		//inorder: [l, g, r, m, d, h, n, b, e, o, i, a, c, p, j, q, f, k]
		//post order: [l, r, m, g, n, h, d, o, i, e, b, p, q, j, k, f, c, a]
		//BFS: alphabetic!
		System.out.println(t);
	}
}

