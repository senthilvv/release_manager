package com.wedyoda.releasemanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

    public Project() {

        projectReleases = new ArrayList<Release>();
    }


    public int ProjectId;
    public String name;
    public String Owner;
    public Date StartDate;
    public Date endDate;
    public List<Release> projectReleases;

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




    @Override
    public String toString() {
        return "Project{" +
                "ProjectId=" + ProjectId +
                ", name='" + name + '\'' +
                ", Owner='" + Owner + '\'' +
                ", StartDate=" + StartDate +
                ", endDate=" + endDate +
                ", projectReleases=" + projectReleases +
                '}';
    }
}
