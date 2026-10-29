public class Project {
    private String name;

    public Project(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }
}
