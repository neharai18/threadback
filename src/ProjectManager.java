import java.util.ArrayList;

public class ProjectManager {
    private ArrayList<Project> project = new ArrayList<>();

    public void addProject(String name) {
        project.add(new Project(name));
    }

    public int count() {
        return project.size();

    }
      public void listProjects() {
        if (project.isEmpty()) {
            System.out.println("No projects yet.");
            return;
        }
        for (Project p : project) {
            System.out.println(p.getName());
        }
    }
    public Project findProject(String name) {
    for (Project p : project) {
       if(p.getName().equalsIgnoreCase(name)){
        return p;
       }
    }
    return null;
}  

}
