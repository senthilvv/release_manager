package com.wedyoda.releasemanager.domain;

import java.util.Date;

public class Main {

    public static void main(String[]  args){

      ProjectManager pm = new ProjectManager();
      Project ucm_project  = pm.addUCMProject();
      //Now create the release object

        Release release = new Release();
        release.name = "First release";
        release.version = "V.0.0.1";

        //Create Release dependencies
        ReleaseDependecy rc1 = new ReleaseDependecy();
        rc1.BuildNumber ="bld.001";
        rc1.depedency = new Depedency("cnr-service", Depedency.DependecyType.MICRO_SERVICE);
        release.addReleaseDependecy(rc1);

      ReleaseDependecy rc2 = new ReleaseDependecy();
      rc2.BuildNumber ="bld.002";
      rc2.depedency = new Depedency("other-service", Depedency.DependecyType.MICRO_SERVICE);
      release.addReleaseDependecy(rc2);


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
