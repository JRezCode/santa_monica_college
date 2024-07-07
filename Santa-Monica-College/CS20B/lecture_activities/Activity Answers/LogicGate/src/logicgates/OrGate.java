package logicgates;
public class OrGate extends BinaryGate{

	public OrGate(boolean bitA, boolean bitB) {
		super(bitA, bitB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getValue() {
		return bitA || bitB;  //notice we don't need getter here because OrGate can see BinaryGate's protected members!
	}

}
