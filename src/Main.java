public class Main {
    public static void main(String[] args) {
        Project p = new Project(" Todo App");
        p.addEntry(new Entry(" Write tests", "Cover validation", EntryType.TASK));
        Entry done = new Entry(" Set up Git", "Initial repo", EntryType.TASK);
        done.markResolved();
        p.addEntry(done);
        p.addEntry(new Entry(" Use SQLite", "Simple and file-based", EntryType.DECISION));
        p.resumeWork();
    }
}