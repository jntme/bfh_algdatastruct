package topic4.classes;

import java.util.ArrayList;
import java.util.List;

import topic4.interfaces.Position;

public class TreeNode<E> implements Position<E> {

	private final LinkedTree<E> assignedTree;

	private ArrayList<Position<E>> children;

	private E element;

	public TreeNode(E element, LinkedTree<E> assignedTree) {
		this.element = element;
		this.assignedTree = assignedTree;
	}
	
	public List<Position<E>> getChildren() {
		return this.children;
	}
	
	public void addChild(TreeNode<E> node) {
		this.children.add(node);
	}
	
	public void addChildren(List<TreeNode<E>> nodes) {
		this.children.addAll(nodes);
	}
	
	/**
	 * Returns true, if the given tree is the assigned tree.
	 * 
	 * @param tree
	 */
	public boolean isAssignedToTree(LinkedTree<E> tree) {
		return tree == assignedTree;
	}

	@Override
	public E element() {
		return this.element;
	}

}
