package topic4.classes;

import java.util.ArrayList;
import java.util.List;

import topic4.exceptions.EmptyTreeException;
import topic4.exceptions.InvalidPositionException;
import topic4.exceptions.UnemptyTreeException;
import topic4.interfaces.Position;
import topic4.interfaces.Tree;

public class LinkedTree<E> implements Tree<E> {

	private int size;
	private Position<E> root;

	public LinkedTree() {
		root = null;
		size = 0;
	}

	public LinkedTree(E rootElement) {
		this.root = new TreeNode<E>(rootElement, null, this);
		size = 1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size <= 0;
	}

	@Override
	public int height() throws EmptyTreeException {
		return countHeight(0, root);
	}

	private int countHeight(int max, Position<E> p) {
		TreeNode<E> node = (TreeNode<E>) p;

		if (!node.isAssignedToTree(this) || node == null)
			throw new EmptyTreeException();

		if (!node.hasChildren())
			return max;

		max++;

		for (Position<E> pos : node.getChildren()) {
			countHeight(max, pos);
		}

		return max;
	}

	@Override
	public List<E> elements() {
		ArrayList<E> returnList = new ArrayList<>();

		List<Position<E>> list = postOrder(root);

		for (Position<E> position : list) {
			returnList.add((position.element()));
		}

		return returnList;
	}

	private List<Position<E>> postOrder(Position<E> p) throws InvalidPositionException {
		ArrayList<Position<E>> list = new ArrayList<>();

		if (p == null)
			return list;

		TreeNode<E> node = (TreeNode<E>) p;
		if (!node.isAssignedToTree(this))
			throw new InvalidPositionException();

		for (Position<E> child : node.getChildren()) {
			postOrder(child);
			list.add(child);
		}

		list.add(p);

		return list;
	}

	@Override
	public List<Position<E>> positions() {
		return postOrder(root);
	}

	@Override
	public Position<E> root() throws EmptyTreeException {
		return this.root;
	}

	@Override
	public Position<E> parent(Position<E> p) throws InvalidPositionException {

		TreeNode<E> node = (TreeNode<E>) p;

		if (node.isAssignedToTree(this) || isRoot(node))
			throw new InvalidPositionException();

		return node.getParent();
	}

	@Override
	public List<Position<E>> children(Position<E> p) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>) p;

		if (!node.isAssignedToTree(this))
			throw new InvalidPositionException();

		return node.getChildren();
	}

	@Override
	public List<Position<E>> descendants(Position<E> p) throws InvalidPositionException {
		List<Position<E>> list = postOrder(p);
		list.remove(p);
		return list;
	}

	@Override
	public List<Position<E>> ancestors(Position<E> p) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>) p;

		if (node == null || !node.isAssignedToTree(this))
			throw new InvalidPositionException();

		ArrayList<Position<E>> list = new ArrayList<>();
		if (isRoot(p))
			return list;

		TreeNode<E> parentNode = node.getParent();

		while (parentNode != null) {
			list.add(parentNode);
			parentNode = parentNode.getParent();
		}

		return list;
	}

	@Override
	public boolean isRoot(Position<E> p) throws InvalidPositionException {
		return root == p;
	}

	@Override
	public boolean isInternal(Position<E> p) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>) p;
		if (!node.isAssignedToTree(this))
			throw new InvalidPositionException();

		return node.hasChildren();
	}

	@Override
	public boolean isExternal(Position<E> p) throws InvalidPositionException {

		TreeNode<E> node = (TreeNode<E>) p;
		if (!node.isAssignedToTree(this))
			throw new InvalidPositionException();

		return !node.hasChildren();
	}

	@Override
	public int depth(Position<E> p) throws InvalidPositionException {
		return depthOf(p, 0);
	}

	private int depthOf(Position<E> p, int count) {

		TreeNode<E> node = (TreeNode<E>) p;
		if (node == null || !node.isAssignedToTree(this))
			throw new InvalidPositionException();

		if (isRoot(node))
			return count;

		count++;
		depthOf(node.getParent(), count);

		return count;
	}

	@Override
	public Position<E> addRoot(E e) throws UnemptyTreeException {
		TreeNode<E> node = new TreeNode<E>(e, null, this);
		root = node;
		size++;
		return root;
	}

	@Override
	public Position<E> insertChild(Position<E> p, E e) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>) p;

		if (!node.isAssignedToTree(this))
			throw new InvalidPositionException();

		TreeNode<E> newNode = new TreeNode<E>(e, node, this);
		node.addChild(newNode);
		size++;

		return newNode;
	}

	@Override
	public E replaceElement(Position<E> p, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void swapElements(Position<E> p, Position<E> q) throws InvalidPositionException {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		if (root == null)
			return "";

		String returnString;

		Position<E> p = root;

		while (isInternal(p)) {
			TreeNode<E> node = (TreeNode<E>) p;
			for (Position<E> pos : children(p)) {

			}
		}

	}
}