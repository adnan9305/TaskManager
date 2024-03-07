package MySystem;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		TasksManager tasksManager = new TasksManager();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//Display menu
			System.out.println("Task Manager Application");
			System.out.println("1. Add a Task");
			System.out.println("2. View all Task");
			System.out.println("3. Delete a Task");
			System.out.println("0. Exit");
			
			System.out.print("Enter Your Choice: ");
			//Get user input
			
			int choice = scanner.nextInt();
			scanner.nextLine(); //consume the nextLine character
			
			switch (choice) {
			case 0:
				System.out.println("Exiting...");
				return;
				
			case 1:
				//Add a task
				System.out.print("Enter the task name: ");
				String name = scanner.nextLine();
				
				System.out.print("Enter the task description: ");
				String description = scanner.nextLine();
				
				LocalDate dueDate = null;	
				while (dueDate == null) {
					System.out.print("Enter the task due date (YYYY-MM-DD):");
					String dueDateString = scanner.nextLine();
					
					try {
						dueDate = LocalDate.parse(dueDateString);
					} catch (DateTimeParseException e) {
						System.out.println("Invalid date format. Please try again.");
					}
				}
				tasksManager.addTask(name, description, dueDate);
				System.out.println("Task add successfully.");
				break;
			case 2:
				// View all tasks
				tasksManager.viewTasks();
				break;
			case 3:
				// Delete a task
				System.out.print("Enter the task number is delete: ");
				int deleteIndex = scanner.nextInt();
				scanner.nextLine(); //consume the newLine character
				
				if (deleteIndex <=0 || deleteIndex > tasksManager.getTask().size()) {
					System.out.println("Invalid task number.Please try again.");
					break;
					
				}
				
				tasksManager.deleteTask(deleteIndex - 1);
				System.out.println("Task deleteed successfully");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
				
			}
			
			System.out.println();
	}

}
}
