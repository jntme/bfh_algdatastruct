package topic4.classes;

import java.util.List;

import topic4.exceptions.EmptyTreeException;
import topic4.exceptions.InvalidPositionException;
import topic4.exceptions.UnemptyTreeException;
import topic4.interfaces.BinaryTree;
import topic4.interfaces.Position;

public class LinkedBinaryTree<E> implements BinaryTree<E> {

	@Override
	public int height() throws EmptyTreeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<E> elements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> root() throws EmptyTreeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> parent(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position<E>> children(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Position<E> leftChild(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> rightChild(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> sibling(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasLeft(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRight(Position<E> p) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Position<E> insertLeft(Position<E> p, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> insertRight(Position<E> p, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertChildren(Position<E> p, E e1, E e2) throws InvalidPositionException {
		// TODO Auto-generated method stub
		
	}
}
