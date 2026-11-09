import java.util.ArrayList;

public class ProjectManager {
    private ArrayList<Project> project = new ArrayList<>();

    public void addProject(String name) {
        project.add(new Project(name));
    }

    public int count() {
        return project.size();

    }

}
