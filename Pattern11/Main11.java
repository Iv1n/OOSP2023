package Pattern11;

public class Main11 {
    public static void main(String[] args){
        TaskManager taskManager = new TaskManager();

        taskManager.addTaskPrototype("task_one", new Task("Task1", "Descriptiom 1"));
        taskManager.addTaskPrototype("task_two", new Task("Task2", "Descriptiom 2"));

        Prototype clone1 = taskManager.getTaskClone("task_one");
        Prototype clone2 = taskManager.getTaskClone("task_two");

        System.out.println(clone1);
        System.out.println(clone2);
    }
}
