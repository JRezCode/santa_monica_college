package logicgates;
public class GateTest {

	public static void main(String[] args)
	{
		BinaryGate a1 = new AndGate(true, true);
		assert a1.getValue() == false : "wow";
		//LogicGate a1 = new AndGate(true, true); is perfectly valid because AndGate is ALSO a LogicGate!
		//BinaryGate a1 = new AndGate(true, true); is perfectly valid because AndGate is ALSO a BinaryGate!
		
	}
}
