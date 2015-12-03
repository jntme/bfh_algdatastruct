package interfaces;

@FunctionalInterface
public interface Mapping<E, F> {

	public F apply(E element);

}