package com.wedyoda.releasemanager.domain;

import java.util.Date;

public class Main {

    public static void main(String[]  args){

      ProjectManager pm = new ProjectManager();


      Project ucm_project  = pm.addUCMProject();

      //Now create the release object



        //Add dependecies added for the project

      ucm_project.addProjectDependencies(new Depedency("AZ-Service", Depedency.DependecyType.MICRO_SERVICE));
      ucm_project.addProjectDependencies(new Depedency("UI-Service", Depedency.DependecyType.MICRO_SERVICE));
      ucm_project.addProjectDependencies(new Depedency("CNR-Service", Depedency.DependecyType.MICRO_SERVICE));
      ucm_project.addProjectDependencies(new Depedency("BL-Service", Depedency.DependecyType.MICRO_SERVICE));
      ucm_project.addProjectDependencies(new Depedency("cnr-db-release", Depedency.DependecyType.DB_DEPLOYMNET));


      Release release = new Release(ucm_project);
      release.Id = 1;
      release.name = "First release";
      release.version = "V.0.0.1";
      release.releaseDate = new Date();

        //Create Release dependencies
        ReleaseBuild rc1 = new ReleaseBuild(ucm_project.ProjectId,"bld.001",new Depedency("AZ-Serivce", Depedency.DependecyType.MICRO_SERVICE));
        ReleaseBuild rc2 = new ReleaseBuild(ucm_project.ProjectId,"bld.002",new Depedency("UI-Serivce", Depedency.DependecyType.MICRO_SERVICE));

        release.addBuilds(rc1);
        release.addBuilds(rc2);

        ucm_project.addProjectRelease(release);


      System.out.println(ucm_project);

        //List of use case

/*        //build
        Operations list
        1. Create a project
        2. Create dependencies for the project.
        3. Create release dependencies
        4. Create release
        5. View release information, including release dependencies
        6. View Project details
        5. Update existing release dependencies*/

    }

}
