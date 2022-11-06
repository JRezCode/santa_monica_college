//---------------------------------------------------------------------------
// ArrayCollection.java          by Dale/Joyce/Weems                Chapter 5
//
// Implements the CollectionInterface using an array.
//
// Null elements are not allowed. Duplicate elements are allowed.
//
// Two constructors are provided: one that creates a collection of a default
// capacity, and one that allows the calling program to specify the capacity.
//---------------------------------------------------------------------------

/* Student: 1654919_Reznik_Jonathan
 * Modified ArrayCollection with toString for HW4P2
 */

package collections;

public class ArrayCollection<T> implements CollectionInterface<T>  
{
	protected final int DEFCAP = 100; // default capacity
	protected T[] elements;           // array to hold collections elements
	protected int numElements = 0;    // number of elements in this collection

	// set by find method
	protected boolean found;  // true if target found, otherwise false
	protected int location;   // indicates location of target if found

	public ArrayCollection() 
	{
		elements = (T[]) new Object[DEFCAP];
	}

	public ArrayCollection(int capacity) 
	{
		elements = (T[]) new Object[capacity];
	}

	protected void find(T target)
	// Searches elements for an occurrence of an element e such that
	// e.equals(target). If successful, sets instance variables
	// found to true and location to the array index of e. If
	// not successful, sets found to false.
	{
		location = 0;
		found = false;

		while (location < numElements) 
		{
			if (elements[location].equals(target))
			{  
				found = true;
				return;
			}
			else
				location++;
		}
	}

	public boolean add(T element)
	// Attempts to add element to this collection.
	// Returns true if successful, false otherwise.
	{
		if (isFull())
			return false;
		else
		{
			elements[numElements] = element;
			numElements++;
			return true;
		}
	}

	public boolean remove (T target)
	// Removes an element e from this collection such that e.equals(target)
	// and returns true; if no such element exists, returns false.
	{
		find(target);    
		if (found)
		{
			elements[location] = elements[numElements - 1];
			elements[numElements - 1] = null;
			numElements--;  
		}
		return found;
	}

	public boolean contains (T target)
	// Returns true if this collection contains an element e such that 
	// e.equals(target); otherwise, returns false.
	{
		find(target);
		return found;
	}

	public T get(T target)
	// Returns an element e from this collection such that e.equals(target);
	// if no such element exists, returns null.
	{
		find(target);    
		if (found)
			return elements[location];
		else
			return null;
	}

	public boolean isFull()
	// Returns true if this collection is full; otherwise, returns false.
	{
		return (numElements == elements.length);
	}

	public boolean isEmpty()
	// Returns true if this collection is empty; otherwise, returns false.
	{
		return (numElements == 0);  
	}

	public int size()
	// Returns the number of elements in this collection. 
	{
		return numElements;
	}

	public int count(T target){
		int counter = 0;
		for(int i = 0; i<numElements; i++){
			if(elements[i].equals(target))
				counter++;
		}
		return counter;
	}

	public void removeAll(T target){
		int reps = count(target);
		for(int i = 0; i<reps; i++){
			remove(target);
		}	  
	}



	public String toString(){
		String S = "ArrayCollection:\n";
		for(int i = 0; i<numElements; i++){
			S = S + " " + elements[i] + "\n";
		}
		return S;
	}

	public ArrayCollection<T> combine(ArrayCollection<T> other) {
		ArrayCollection<T> list = new ArrayCollection<T>();
		for (int i = 0; i<this.numElements; i++)
			list.add(this.elements[i]);
		for (int i = 0; i<other.numElements; i++)
			list.add(other.elements[i]);
		return list;
	}
}
