package com.wedyoda.releasemanager.domain;

public class ProjectDependecy {

    public ProjectDependecy( int projectId, Depedency depedency) {

        this.depedency = depedency;
        this.ProjectId = projectId;
    }
   protected int ProjectId;
   public Depedency depedency;


    @Override
    public String toString() {
        return "ProjectDependecy{" +
                "ProjectId=" + ProjectId +
                ", depedency=" + depedency +
                '}';
    }

}
