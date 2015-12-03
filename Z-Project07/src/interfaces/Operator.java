package interfaces;

@FunctionalInterface
public interface Operator<E> {

	public E apply(E element1, E element2);

}