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
