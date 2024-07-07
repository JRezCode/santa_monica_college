package logicgates;

/**
 * This class represents an abstract Binary Gate class. We 
 * hold two data members (bitA and bitB). Note this is the version
 * in which we store the status of our gate's inputs
 * @author irma
 *
 */
abstract class BinaryGate extends LogicGate {
	//we need two inputs for our binary gate
	//they are protected because we want the classes 
	//that inherit from our binary gate to access these fields
	protected boolean bitA; //alternatively you can also do int instead of boolean (0 - false, 1 - true). It is often used in logic
	protected boolean bitB; //alternatively you can also do int instead of boolean (0 - false, 1 - true). It is often used in logic
	
	/**
	 * This is a constructor of a binary gate. It takes two input bits
	 * @param bitA
	 * @param bitB
	 */
	public BinaryGate(boolean bitA, boolean bitB)
	{
		this.bitA = bitA;
		this.bitB = bitB;
	}
	
	/**
	 * Attention: BinaryGate doesn't have to implement getValue() because it is also an abstract class!
	 */
}
