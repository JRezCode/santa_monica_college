//The interface for Pairs has two setter and getters required
interface PairInterface<T> {
	void setFirst(T first);
	void setSecond(T second);
	T getFirst();
	T getSecond();
}