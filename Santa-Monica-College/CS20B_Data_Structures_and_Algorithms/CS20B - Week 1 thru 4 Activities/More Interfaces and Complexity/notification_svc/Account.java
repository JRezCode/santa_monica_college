package notification_svc;

public class Account {
	
	private String name;
	private int account;
	private EmailNotification n;
	private int lTimes=1;
	
	public Account(String username, int pin, EmailNotification n) {
		this.name=username;
		this.account = pin;
		this.n = n;
	}
	
	public boolean login(String n, int p) throws BadLogin {
		if(lTimes == 3) {
			this.n.notifyClient("Max number of login attempts");
			throw new BadLogin("Your account is lockout");
		}
		
		if(lTimes != 3 && (!this.name.equals(n) || this.account != p)){
			lTimes++;
			throw new BadLogin("You have entered wrong pin.");
		}
		return true;
	}
	
	public void setUsername(String string){
		this.name=string;
	}

	public String getUsername(){
		return this.name;
	}

}
