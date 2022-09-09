package InheritanceExamples;

public class ProduceItem extends StoreItem {
	public void setExpiration(String newDate) {
		expirationDate = newDate;
		return;
	}
	
	public String getExperiation() {
		return expirationDate;
	}
	
	private String expirationDate;
	
	@Override
	public void printItem() {
		System.out.println(itemName + " " + itemQuantity + " (Expires: " + expirationDate + ")");
		return;
	}
}
