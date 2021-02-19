package com.wedyoda.releasemanager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Release {

    public Release(Project project) {

        this.releaseBuilds = new ArrayList<ReleaseBuild>();
        this.project = project;
    }

    int Id;
    String name;
    String version;
    Date releaseDate;
    List<ReleaseBuild>  releaseBuilds;


    //Should release contain Project or projectID,  how can we decouple ??
    Project project;


    public void addBuilds(ReleaseBuild build)
    {
        build.releaseId = this.Id;
        if(this.releaseBuilds !=null && this.project.validateDepenecy(build.depedency))
            this.releaseBuilds.add(build);
    }

    private boolean validateProjectDepedency(ReleaseBuild build)
    {
        return this.project.validateDepenecy(build.depedency);

        //Find the project
        //Check if Dependency is allowed


        //Questions
        //1. Should Release be aware of Project ???
        //2. Should we outsource to ProjectDepenecyValidationHelper ??

        //Dependecy inversion pattern

}


    @Override
    public String toString() {
        return "Release{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", releaseDate=" + releaseDate +
                ", releaseBuilds=" + releaseBuilds +
                '}';
    }
}
