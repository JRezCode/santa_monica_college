package set;

public interface AdvancedSetInterface<T> extends CollectionInterface<T> {
	
	  ArrayCollection<T> union(ArrayCollection<T> other);
	  // Returns a collection that is the union of one with another

	  ArrayCollection<T> intersection(ArrayCollection<T> other);
	  // Returns a collection that is the intersection of one with another
	  
	  ArrayCollection<T> difference(ArrayCollection<T> other);
	  // Returns a collection that is the difference of one with another
	  
}
