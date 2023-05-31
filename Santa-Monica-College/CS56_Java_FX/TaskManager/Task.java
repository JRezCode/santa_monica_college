package TaskManager;
import java.time.LocalDate;

public class Task {
    //id
    LocalDate due;
    LocalDate created;
    LocalDate start;
    String task;
    String description;

    public Task(LocalDate due_date) {
        System.out.println("Task constructor called.");
        due = due_date;
        created = LocalDate.now();        
        task = "Placeholder for task";
        description = "Placeholder for description";

    }

    public String toString(){
        return (this.task + "created on:" + this.created.toString());
    }
}
