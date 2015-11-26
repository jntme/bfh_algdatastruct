package topic4.classes;

import java.util.List;

import topic4.exceptions.EmptyTreeException;
import topic4.exceptions.InvalidPositionException;
import topic4.exceptions.UnemptyTreeException;
import topic4.interfaces.Position;
import topic4.interfaces.Tree;

public class LinkedTree<E> implements Tree<E>{
	
	private int size = 0;

	private Position<E> root;

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size <= 0;
	}

	@Override
	public int height() throws EmptyTreeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<E> elements() {
		
		return null;
	}

	@Override
	public List<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> root() throws EmptyTreeException {
		return this.root;
	}

	@Override
	public Position<E> parent(Position<E> p) throws InvalidPositionException {
		
		return null;
	}

	@Override
	public List<Position<E>> children(Position<E> p) throws InvalidPositionException {
		TreeNode<E> node = (TreeNode<E>) p;
		
		return node.getChildren();
	}

	@Override
	public List<Position<E>> descendants(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position<E>> ancestors(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRoot(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInternal(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExternal(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int depth(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Position<E> addRoot(E e) throws UnemptyTreeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> insertChild(Position<E> p, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
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

}
