package set;

public class AdvancedSet<T> extends ArrayCollection<T>
								implements AdvancedSetInterface<T>{

	  public AdvancedSet() 
	  {
	    super();
	  }

	@Override
	public ArrayCollection<T> union(ArrayCollection<T> other) {
		//make sure the new array is constructed large enough by combining set sizes
		ArrayCollection<T> join = new ArrayCollection<T>(other.size()+this.size());
		for (int i = 0; i<this.numElements; i++)
			join.add(this.elements[i]);
		for (int i = 0; i<other.numElements; i++)
			join.add(other.elements[i]);
		return join;
	}

	@Override
	public ArrayCollection<T> intersection(ArrayCollection<T> other) {
		ArrayCollection<T> cross = new ArrayCollection<T>();
		for (int i = 0; i<this.numElements; i++){
			for (int j = 0; j<other.numElements; j++){
			if(other.elements[i]==this.elements[j]);
			cross.add(elements[i]);
			}
		}
		return cross;
	}

	@Override
	public ArrayCollection<T> difference(ArrayCollection<T> other) {
		//This time for the size of the return array select the larger of the two arrays
		ArrayCollection<T> minus = new ArrayCollection<T>(Math.max(this.size(), other.size()));
		for (int i = 0; i<this.numElements; i++)
			minus.add(this.elements[i]);
		for (int i = 0; i<other.numElements; i++)
			minus.remove(other.elements[i]);
		return minus;
	}
}
