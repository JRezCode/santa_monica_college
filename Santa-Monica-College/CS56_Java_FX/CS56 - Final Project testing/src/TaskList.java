import java.io.*;
import java.util.ArrayList;

public class TaskList{

	//  private TaskList<Task> temp = new TaskList<>();
	private ArrayList<Task> tasklist;

	public TaskList(){
		tasklist = new ArrayList<Task>();
	}


	public void AddTask(Task p) {

		tasklist.add( p );

		try(ObjectOutputStream obStream = new ObjectOutputStream(
				new FileOutputStream("/home/jonathanr/Developer/array.txt"))){
			
			obStream.writeObject(tasklist);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	public void deleteTalk(Task p) {
		try (ObjectInputStream finput = new ObjectInputStream(
				new FileInputStream( "/home/jonathanr/Developer/array.txt"))){

			tasklist = (ArrayList<Task>)finput.readObject();
		
			if(tasklist.contains(p))
				tasklist.remove(p);
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("++++++++++++++++++++");
		try (ObjectOutputStream obStream = new ObjectOutputStream(
				new FileOutputStream("/home/jonathanr/Developer/array.txt"))){

			obStream.writeObject(tasklist);
	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public void showData(){
		ArrayList<Task> list = new ArrayList<>();
		try (ObjectInputStream finput = new ObjectInputStream(
				new FileInputStream( "/home/jonathanr/Developer/array.txt"))){

			list = (ArrayList<Task>)finput.readObject();

		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for(Task xx : list) {
			System.out.println(xx.toString());
		}
	}





}
