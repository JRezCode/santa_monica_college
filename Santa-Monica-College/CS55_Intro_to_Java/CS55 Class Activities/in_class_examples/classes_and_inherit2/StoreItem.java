package classes_and_inherit2;

public class StoreItem {
	protected String itemName;
	protected int itemQuantity;	

	public void setName(String newName) {
		itemName = newName;
		return;
	}
	
	public void setQuantity(int newQty) {
		itemQuantity = newQty;
		return;
	}
	
	public void printItem() {
		System.out.println(itemName + " " + itemQuantity);
		return;
	}
}