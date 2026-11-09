public class Main {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        manager.addProject("Todo App");
        manager.addProject("Threadback");
        System.out.println("Total: " + manager.count());

    }
}