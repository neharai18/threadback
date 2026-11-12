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

}
