package ch06.lists;


/**
 * In this class I showcase the iteration options for a list that doesn't implement Iterable
 * and the one that does
 * @author irma
 *
 */
public class DriverCodeTestIterator {

	public static void main(String[] args) {
		ListInterface<Integer> list = new ABList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));

		ListInterfaceNoIterator<Integer> list1 = new ListNoIterator<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));

		for(Integer i : list) {
			System.out.println(i);
		}
		
		/*for(Integer i : list1) { //cannot do this
			System.out.println(i);
		}*/
	}

}


