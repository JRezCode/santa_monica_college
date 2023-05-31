package TaskManager;
import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        Task a = new Task(LocalDate.now().plusDays(1));
        System.out.println((a));
    }
}
