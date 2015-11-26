package topic4.classes;

import java.util.ArrayList;
import java.util.List;

import topic4.interfaces.Position;

public class TreeNode<E> implements Position<E> {

	private ArrayList<TreeNode<E>> children;
	private E element;

	public TreeNode(E element) {
		this.element = element;
	}
	
	public List<TreeNode<E>> getChildren() {
		return this.children;
	}
	
	public void addChild(TreeNode<E> node) {
		this.children.add(node);
	}
	
	public void addChildren(List<TreeNode<E>> nodes) {
		this.children.addAll(nodes);
	}

	@Override
	public E element() {
		return this.element;
	}

}
