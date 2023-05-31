

public class Main {

	public static void main(String[] args) {
		// write your code here
		TaskList input = new TaskList();

		Task clean = new Task("clean",34);
		Task clean_copy = new Task("clean",34);
		Task doHomeWrok = new Task("doHomeWrok",10);
		Task doHomeWrok_copy = new Task("doHomeWrok",10);
		Task sleepEArly = new Task("cleanEArly",34);
		Task sleepEArly_copy = new Task("cleanEArly",34);
		//
		input.AddTask(clean);
		input.AddTask(doHomeWrok);
		input.AddTask(sleepEArly);
		input.AddTask(clean_copy);
		input.AddTask(doHomeWrok_copy);
		input.AddTask(sleepEArly_copy);
		

		input.showData();

		System.out.println("=======================");

		input.deleteTalk(clean);

		input.showData();


	}
}
