package logicgates;

/**
 * This class represents the and gate
 * @author irma
 *
 */
public class AndGate extends BinaryGate{
    /**
     * Constructor of the and gate
     * @param bitA
     * @param bitB
     */
	public AndGate(boolean bitA, boolean bitB) {
		super(bitA, bitB);
	}

	@Override
	public boolean getValue() {
		return bitA && bitB;
	}

}
