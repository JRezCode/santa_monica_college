package classes_and_inherit1;
public class Person {
	// ===== Code from file Class1.java =====
	private int ageYears;
	private String lastName;
	public void setName(String userName) {
		lastName  = userName;
		return;
		}
	public void setAge(int numYears) {
		ageYears = numYears;
		return;
		}
	// Other parts omitted
	public void printAll() {
		System.out.print("Name: " + lastName);
		System.out.print(", Age: "  + ageYears);
		return;
		}
	}