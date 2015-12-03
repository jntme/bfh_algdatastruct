package topic4.classes;

import java.util.ArrayList;
import java.util.List;

import topic4.interfaces.Position;

public class TreeNode<E> implements Position<E> {

	private final LinkedTree<E> assignedTree;
	
	private final TreeNode<E> parent;

	private ArrayList<Position<E>> children;

	private E element;

	public TreeNode(E element, TreeNode<E> parent, LinkedTree<E> assignedTree) {
		this.element = element;
		this.assignedTree = assignedTree;
		this.parent = parent;
		
		this.children = new ArrayList<>();
	}
	
	public TreeNode<E> getParent() {
		return parent;
	}

	public List<Position<E>> getChildren() {
		return children;
	}
	
	public boolean hasChildren() {
		return children.size() > 0;
	}
	
	public void addChild(TreeNode<E> node) {
		children.add(node);
	}
	
	public void addChildren(List<TreeNode<E>> nodes) {
		children.addAll(nodes);
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
