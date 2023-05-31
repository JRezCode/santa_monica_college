import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {

	
	public static int countEvenArray(List<Integer> l)
	{
		int N = 0;
		for (int i : l)
		{
			if(i % 2 == 0)
				N++;
		}
		return N;
	}
	
	
	public static int countEvenArray(int[] arr)
	{
		int N = 0;
		for(int i : arr)
		{
			if(i % 2 == 0)
				N++;
		}
		//second version of for loops
		/*for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
				N++;
			
		}*/
		return N;
	}
	
	//here I test my methods
	public static void main(String[] args)
	{
		int[] arr = new int[] {1, 2, 5, 7, 5, 8, 10, 11, 12};
		List<Integer> l = new ArrayList(Arrays.asList(1, 2, 5, 7, 5, 8, 10, 11, 12)); //here is how to take an array and turn it into a List
		//you don't have to do this of course, I just show you different ways of doing it
		System.out.println(countEvenArray(arr));
		System.out.println(countEvenArray(l));
	}
}
