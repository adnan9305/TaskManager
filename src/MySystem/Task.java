package MySystem;
import java.time.LocalDate;

public class Task {
	private String name;
	
	private String description;
	
	private LocalDate dueDate;
	
	//constructor
	
	public Task(String name, String description, LocalDate dueDate) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
	}
	
	// Getter and setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	//toString method to display task information
	
	@Override
	public String toString(){
		return "\nTask Name: " + name + "\nDescription: " +description + "\nDue Date: " +dueDate;
	}
}
