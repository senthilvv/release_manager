package com.wedyoda.releasemanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectManager {

    public ProjectManager() {

        //this._projectList = new ArrayList<Project>();


    }

    private Project ucm_project = new Project();


    public  Project addUCMProject()
    {
        Project ucm_project = new Project();
        ucm_project.ProjectId =1;
        ucm_project.name ="ucm_project";
        ucm_project.Owner = "Jhon Smith";
        ucm_project.StartDate = new Date();
        ucm_project.endDate = new Date();
        return  ucm_project;

    }

    public  void AddProjectDependencies( Project project, Depedency depedency)
    {

        //project.addProjectDependencies(  );

        ucm_project.addProjectDependencies(new Depedency("AZ-Service", Depedency.DependecyType.MICRO_SERVICE));
        ucm_project.addProjectDependencies(new Depedency("UI-Service", Depedency.DependecyType.MICRO_SERVICE));
        ucm_project.addProjectDependencies(new Depedency("CNR-Service", Depedency.DependecyType.MICRO_SERVICE));
        ucm_project.addProjectDependencies(new Depedency("BL-Service", Depedency.DependecyType.MICRO_SERVICE));
        ucm_project.addProjectDependencies(new Depedency("cnr-db-release", Depedency.DependecyType.DB_DEPLOYMNET));
    }





    ///private List<Project> _projectList;

    //1. Create a project
//    public void addProject(Project project)
//    {
//      this._projectList.add(project);
//    }


/*    public  void  addRelease(int projectid, Release release)
    {
        for(Project project : _projectList) {
            if(project.getId() == projectid)  {
                project.addProjectRelease(release);
            }
        }
    }*/

    @Override
    public String toString() {
        return "ProjectManager{" +
                "ucm_project=" + ucm_project +
                '}';
    }
}
