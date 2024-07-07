package LLSTACK;

public interface StackInterface<T>
{
  void push(T element);
  // places element at the top of this stack without throwing exceptions

  void pop();
  // removes top element from stack without throwing exceptions
  
  T top();
  // returns top element of this stack
  
  boolean safePush(T el);
  // Returns true if pushing of new element succeeded, otherwise returns false.
  
  boolean safePop();
  // Returns true if pop method on top of stack element succeeded, otherwise returns false.  
  
  boolean isEmpty();
  // Returns true if this stack is empty, otherwise returns false.

  boolean isFull();
  // Returns true if this stack is full, otherwise returns false.
}
