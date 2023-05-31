package classes_and_inherit2;

public class ProduceItem extends StoreItem {
	public void setExpiration(String newDate) {
		expirationDate = newDate;
		return;
	}
	
	public String getExperiation() {
		return expirationDate;
	}
	
	private String expirationDate;
	

	//For some reason this is causing an issue to have @Override here...
	@Override
	public void printItem() {
		System.out.println(itemName + " " + itemQuantity + " (Expires: " + expirationDate + ")");
		return;
	}
}
