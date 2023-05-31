package classes_and_inherit1;
public class BaseClass {
	public static void main (String [] args) {
		ClassSub courseStudent = new ClassSub();
		courseStudent.setAge (20);
		courseStudent.setID  (9999);
		courseStudent.printAll();
		System.out.println(", ID: " + courseStudent.getID());
		return;
		}
	}


class ClassSub extends Person {
	private int idNum;
	public void setID(int studentId) {
		idNum = studentId;
		}
public int getID() {
	return idNum;
	}
}
