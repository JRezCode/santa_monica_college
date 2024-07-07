package logicgates;

public class NotGate extends UnaryGate{

	/**
	 * NotGate constructor
	 * @param bitA
	 */
	public NotGate(boolean bitA) {
		super(bitA);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getValue() {
		return !bitA;
	}

}
