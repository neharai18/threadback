public class Main {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        manager.listProjects();
        manager.addProject("Todo App");
        manager.addProject("Threadback");
        manager.listProjects();
        System.out.println("Total: " + manager.count());

    }
}