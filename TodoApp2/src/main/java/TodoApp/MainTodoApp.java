
package TodoApp;

import controller.ProjectController;
import java.util.List;
import model.Project;
import util.ConnectionFactory;


public class MainTodoApp {

    
    public static void main(String[] args) {
        
//        ProjectController projectController = new ProjectController();
        
//        Project project = new Project(); 
//        project.setName("Projeto teste");
//        project.setDescription("description");
//        projectController.save(project);
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setId(12);
        project.setName("Novo nome do projeto");
        project.setDescription("description");
        projectController.update(project);
        
        // Criar lista de projetos e pegar a lista que está no banco
        List<Project> projects = projectController.getAll();
        // imprimir o texto mais a quantidade de itens na lista de projetos     
        System.out.println("Total de projetos = " + projects.size());
        
        projectController.removeById(12);
    }
    
}
