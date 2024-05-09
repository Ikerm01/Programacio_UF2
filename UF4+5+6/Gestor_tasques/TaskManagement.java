/*Escriu un programa que permeti gestionar una llista de tasques.
Cada tasca hauria de tenir un identificador únic, una descripció i una prioritat (baixa, mitjana o alta).

El programa hauria de permetre les següents funcionalitats:

    Afegir una nova tasca.
    Marcar una tasca com a completada.
    Esborrar una tasca.
    Mostrar totes les tasques.
    Mostrar les tasques per prioritat (baixa, mitjana o alta).
    Sortir del programa.

Pista: Hem vist Array, HashMap i ArrayList */


package Gestor_tasques;

import java.util.HashMap;

public class TaskManagement {

    private HashMap<Integer, Task> tasks;
    private HashMap<String, ArrayList<Task>> lists;

    public TaskManagement(){
        tasks = new HashMap<Integer, Task>();
    }
    public void addTask(String taskName, String priority){}
    public void doneTask(int taskId){}
    public void deleteTask(int taskId){}
    public void printAllTask(){}
    public void printTaskPriority(String priority){}
}
