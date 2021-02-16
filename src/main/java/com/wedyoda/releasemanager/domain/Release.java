package com.wedyoda.releasemanager.domain;

import java.util.ArrayList;
import java.util.List;

public class Release {

    public Release() {

        this.releaseDependecies = new ArrayList<ReleaseDependecy >();
    }


    String name;
    String version;
    List<ReleaseDependecy>  releaseDependecies;

    public void addReleaseDependecy(ReleaseDependecy releaseDependecy)
    {
        if(this.releaseDependecies !=null)
            this.releaseDependecies.add(releaseDependecy);
    }


    @Override
    public String toString() {
        return "Release{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", releaseDependecies=" + releaseDependecies +
                '}';
    }
}
