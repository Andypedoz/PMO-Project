package interfaces;

public interface Pair<T1,T2> {
	T1 getFirst();
	T2 getSecond();
	void setFirst(T1 first);
	void setSecond(T2 second);
	boolean equals(Object o);
}
