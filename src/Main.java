public class Main {
    public static void main(String[] args) {
        Project p = new Project("Todo App");
        p.addEntry(new Entry(" Fixed login bug", "Null check was missing", EntryType.BUG));
        p.addEntry(new Entry(" Use SQLite", "Simple and file-based", EntryType.DECISION));
        p.addEntry(new Entry(" Write tests", "Cover validation", EntryType.TASK));
        p.showRecent(2);
    }
}