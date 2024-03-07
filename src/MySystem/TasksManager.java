package MySystem;
import java.time.LocalDate;
import java .util.ArrayList;
import java.util.List;

public class TasksManager {
	
	private List<Task> tasks;
	
	//Constructor
	
	public TasksManager() {
		tasks = new ArrayList<>();
	}
	
	//Add a task
	
	public void addTask(String name, String description, LocalDate dueDate) {
		Task task =new Task(name, description, dueDate);
		tasks.add(task);
	}
	
	//Edit a task
	
	public void editTask(int index, String name, String description, LocalDate dueDate) {
		Task task = tasks.get(index);
		task.setName(name);
		task.setDescription(description);
		task.setDueDate(dueDate);
	}
	
	public List<Task> getTask(){
		return tasks;
	}
	
	//View all tasks
	
	public void viewTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks found");
			return;
		}
		
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println("Task #" + (i + 1));
			System.out.println(tasks.get(i));
			System.out.println(); //empty line for formation
			
		}
	}
	
	//Delete a task
	
	public void deleteTask(int index) {
		tasks.remove(index);
	
	}
	

}
