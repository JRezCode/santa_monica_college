package sampleinterface;


public class SampleImplementationClass implements SampleInterface {

	public void pop() {
		System.out.println("This is example of good interface implementation because" +
				"it uses the same signature as the method from interface");
	}
}

	//This would not be ok in place of the above because the method's signature is incorrect
	/*	public int pop() {
		return 5;
		}
	*/

	//Programming with interfaces is also known as programming by contract in certain settings

	
