package stack.noexcept;
public interface StackInterface<T> {
	public void pop();
	public void push(T obj);
	public T top();
	public boolean isEmpty();
	public boolean isFull();
	
}
