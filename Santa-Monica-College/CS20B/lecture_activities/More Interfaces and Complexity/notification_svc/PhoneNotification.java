package notification_svc;

public class PhoneNotification implements NotificationSvc {

	private String phonenumber;
	
	public PhoneNotification(String phoneNumber) {
		this.phonenumber=phoneNumber;
	}

	@Override
	public void notifyClient(String message) {
		System.out.println("Phone notification message delivered to " + this.phonenumber);
	}

}
