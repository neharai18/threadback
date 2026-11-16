public class Main {
    public static void main(String[] args) {
        ProjectManager manager = new ProjectManager();
        manager.addProject("Todo App");
        manager.findProject("nothing");

        Project found = manager.findProject("threadback");
        if (found == null) {
            System.out.println("Not found");
        } else {
            found.addEntry(new Entry("Plan MVP", "Start with console", EntryType.NOTE));
            found.resumeWork();
        }
    }
}