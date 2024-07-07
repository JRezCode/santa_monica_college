package notification_svc;

public class EmailNotification implements NotificationSvc {

	private String email;

	public EmailNotification(String em){
		this.email=em;
	}

	public void notifyClient(String m) {
		System.out.println("Email sent to " + this.email);
	}

}
