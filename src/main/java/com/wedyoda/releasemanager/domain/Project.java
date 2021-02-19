package com.wedyoda.releasemanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

    public Project() {

        projectReleases = new ArrayList<Release>();
        projectDependencies  = new ArrayList<ProjectDependecy>();
    }




    public int ProjectId;
    public String name;
    public String Owner;
    public Date StartDate;
    public Date endDate;
    public List<Release> projectReleases;
    public List<ProjectDependecy> projectDependencies;


    //region Properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion


    public int getId()
    {
        return  this.ProjectId;
    }


    public void addProjectRelease(Release newRelease)
    {
        if(this.projectReleases !=null)
            this.projectReleases.add(newRelease);
    }


    public void addProjectDependencies(Depedency depedency)
    {
        if(this.projectDependencies !=null)
            this.projectDependencies.add(new ProjectDependecy(this.ProjectId,depedency));
    }


    public boolean validateDepenecy(Depedency depedency) {

        return this.projectDependencies.contains(depedency);
    }


    @Override
    public String toString() {
        return "Project{" +
                "ProjectId=" + ProjectId +
                ", name='" + name + '\'' +
                ", Owner='" + Owner + '\'' +
                ", StartDate=" + StartDate +
                ", endDate=" + endDate +
                ", projectReleases=" + projectReleases +
                ", projectDependencies=" + projectDependencies +
                '}';
    }


}
