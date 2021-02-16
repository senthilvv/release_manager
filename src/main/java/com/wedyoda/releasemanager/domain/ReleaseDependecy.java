package com.wedyoda.releasemanager.domain;

public class ReleaseDependecy {

    public ReleaseDependecy() {
    }

    public String BuildNumber;
   public Depedency depedency;


    @Override
    public String toString() {
        return "ReleaseDependecy{" +
                "BuildNumber='" + BuildNumber + '\'' +
                ", depedency=" + depedency +
                '}';
    }
}
