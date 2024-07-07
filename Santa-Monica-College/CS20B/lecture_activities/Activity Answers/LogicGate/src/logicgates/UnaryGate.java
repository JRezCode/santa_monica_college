package logicgates;
/**
 * This class represents a UnaryGate
 * @author irma
 *
 */
abstract class UnaryGate extends LogicGate {
	
	protected boolean bitA; //unary gates have only one input
	//alternatively you can also do int instead of boolean (0 - false, 1 - true). It is often used in logic
	
	/**
	 * UnaryGate constructor takes only one input bit
	 * @param bitA
	 */
	public UnaryGate(boolean bitA)
	{
		this.bitA = bitA;
	}
}
