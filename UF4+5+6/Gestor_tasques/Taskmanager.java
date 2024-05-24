package Gestor_tasques;

import java.util.HashMap;
import java.util.ArrayList;

class TaskManagement
{
	HashMap<String, ArrayList<Task>> lists;
	HashMap<Integer, Task> tasks;

	public TaskManagement() {
		lists = new HashMap<String, ArrayList<Task>>();
		lists.put("Baja", new ArrayList<Task>());
		lists.put("Media", new ArrayList<Task>());
		lists.put("Alta", new ArrayList<Task>());
		tasks = new HashMap<Integer, Task>();
	}

	public void addTask(String taskName, String priority) {
		Task task = new Task(taskName);
		lists.get(priority).add(task);
		tasks.put(task.getId(), task);
	}

	public void doneTask(int taskId) {
		tasks.get(taskId).done();
	}

	public void deleteTask(int taskId) {
		tasks.remove(taskId);
	}

	public void printAllTask() {
		tasks.forEach((key, task) -> {
			System.out.println(task);
		}
		);
	}

	public void printTaskByPriority(String priority) {
		System.out.println("Tareas de prioridad: " + priority);
		for (Task task: lists.get(priority)) {
			System.out.println(task);
		}
	}
    public void modifyTask(int taskId, String taskName, String Description, String DueDate) {
        Task task = tasks.get(taskId);
        task.taskName = taskName;
        task.Description = Description;
        task.DueDate = DueDate;
    }
    
    public void listTasksByStatus(String status) {
        System.out.println("Tareas con estado: " + status);
        tasks.forEach((key, task) -> {
            if (task.getStatus() == status) {
                System.out.println(task);
            }
        });
    }
        

}

class Task {
    private static int numInstances = 0;
    private int id;
    private String name;
    private String description;
    private String dueDate;
    private boolean isDone;
    private String status; 

    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isDone = false;
         // Inicialmente el estado es "Pendiente"
        this.status = "Pendiente";
        this.id = ++numInstances;
    }

    public void done() {
        this.isDone = true;
         // Actualizar el estado de la tarea
        this.status = "Completada"; 
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isDone() {
        return this.isDone;
    }
}

class Main {
    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();
        System.out.println("Añadir tarea");
        manager.addTask("Aprobar Programación", "Preparar el examen final", "2024-05-31");
        System.out.println("Imprimir todas las tareas");
        manager.printAllTask();
        System.out.println("Imprimir tareas por prioridad");
        manager.printTaskByPriority("Alta");
        System.out.println("Marcar tarea como completada");
        manager.doneTask(1);
        System.out.println("Imprimir todas las tareas");
        manager.printAllTask();
        System.out.println("Modificar una tarea");
        manager.modifyTask(1, "Aprobar Programación", "Preparar examen y práctica final", "2024-06-15");
        System.out.println("Imprimir todas las tareas");
        manager.printAllTask();
        System.out.println("Imprimir tareas por estado");
        manager.listTasksByStatus("Completada");
        System.out.println("Eliminar una tarea");
        manager.deleteTask(1);
        System.out.println("Imprimir todas las tareas");
        manager.printAllTask();
    }
}