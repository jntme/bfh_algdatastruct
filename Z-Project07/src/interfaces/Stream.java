package interfaces;

import java.util.List;

public interface Stream<E> extends Iterable<E> {

	public boolean matchAll(Predicate<? super E> predicate);

	public boolean matchAny(Predicate<? super E> predicate);

	public int countAll();

	public int count(Predicate<? super E> predicate);

	public E get(int index) throws IndexOutOfBoundsException;

	public E find(Predicate<? super E> predicate);

	public E reduce(Operator<E> operator);

	public List<E> toList();

	public Stream<E> limit(int n) throws IllegalArgumentException;

	public Stream<E> skip(int n) throws IllegalArgumentException;

	public Stream<E> filter(Predicate<? super E> predicate);

	public <F> Stream<F> map(Mapping<? super E, ? extends F> mapping);

}
