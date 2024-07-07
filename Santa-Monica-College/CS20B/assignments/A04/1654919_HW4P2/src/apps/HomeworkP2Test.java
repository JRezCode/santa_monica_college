package apps;

import collections.ArrayCollection;

public class HomeworkP2Test {

	public static void main(String[] args){
		
		ArrayCollection<Integer> numbers = new ArrayCollection<>();
		numbers.add(5);
		numbers.add(10);
		numbers.add(50);
		numbers.add(2);
		numbers.add(1);
		System.out.println("Testing string representation output:");
		System.out.println(numbers);

		System.out.println("Testing removal of a single value:");
		numbers.removeAll(2);
		System.out.println(numbers);

		System.out.println("Adding several more of a single value:");
		numbers.add(50);	numbers.add(50);	numbers.add(50);
		numbers.add(5);		numbers.add(5);		numbers.add(2);
		
		System.out.println(numbers);
		System.out.println("There's now values to test a single sweep removal");
		numbers.removeAll(50);
		numbers.removeAll(5);
		System.out.println(numbers);
		
		System.out.println("Finally to test two collections when combining them");
		ArrayCollection<Integer> moreNumbers = new ArrayCollection<>();
		moreNumbers.add(100);	moreNumbers.add(200);	moreNumbers.add(300);
		System.out.println(numbers.combine(moreNumbers));
		
	}

}
