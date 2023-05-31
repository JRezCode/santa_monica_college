import java.io.Serializable;
import java.util.Objects;

public class Task  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    int num;

    public Task(String name, int num) {
        this.name = name;
        this.num = num;
    }


    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return " name " + getName() + " number " + getNum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return num == task.num &&
                Objects.equals( name, task.name );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, num );
    }
}
