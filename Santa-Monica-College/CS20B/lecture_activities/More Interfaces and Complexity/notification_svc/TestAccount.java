package notification_svc;
import java.util.Scanner;

public class TestAccount {

	public TestAccount() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		Account acc = new Account("jonR", 1234, new EmailNotification("jon@gmail.com"));
		acc.setUsername("jonR");
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				acc.login(acc.getUsername(), scan.nextInt());
			}
			catch(BadLogin ex){
				 break;				
			}
		}		
		scan.close();
	}
}
