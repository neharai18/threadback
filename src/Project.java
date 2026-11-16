import java.util.ArrayList;

public class Project {
    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Project(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public void addEntry(Entry entry) {
        if (entry == null) {
            throw new IllegalArgumentException("Enter is required");
        }
        entries.add(entry);
    }

    public int getEntryCount() {
        return entries.size();
    }

    public void listEntries() {
        if (entries.isEmpty()) {
            System.out.println("No entries yet.");
            return;
        }
    }

    public void searchEntries(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            throw new IllegalArgumentException("Keyword cannot be empty");
        }
        String key = keyword.trim().toLowerCase();
        boolean found = false;

        for (Entry e : entries) {
            if (e.getTitle().toLowerCase().contains(key) || e.getContent().toLowerCase().contains(key)) {
                System.out.println("[" + e.getType() + "]" + e.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Matching Entries.");
        }

    }

    public void showRecent(int limit) {
        if (entries.isEmpty()) {
            System.out.println("No entries yet.");
            return;
        }
        int printed = 0;
        for (int i = entries.size() - 1; i >= 0 && printed < limit; i--) {
            Entry e = entries.get(i);
            System.out.println("[" + e.getType() + "]" + e.getTitle());
            printed++;
        }
    }

    public void showOpenTasks() {
        boolean found = false;
        for (Entry e : entries) {
            if (e.getType() == EntryType.TASK && !e.isResolved()) {
                System.out.println("[TASK] " + e.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No open tasks.");
        }
    }
}
