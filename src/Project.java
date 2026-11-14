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
            if(e.getTitle().toLowerCase().contains(key)|| e.getContent().toLowerCase().contains(key)){
                System.out.println("["+ e.getType()+"]"+e.getTitle());
                found=true;
            }
        }
            if(!found){
                System.out.println("No Matching Entries.");
            }

        }
    }


