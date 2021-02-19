package com.wedyoda.releasemanager.domain;

public class ReleaseBuild {

    public ReleaseBuild(int releaseId, String buildNumber, Depedency depedency ) {

        this.releaseId  = releaseId;
        this.depedency= depedency;
        this.BuildNumber=buildNumber;
    }

    //Should we have release or release ID ?
    protected  int releaseId;
    protected String BuildNumber;
    protected  Depedency depedency;

    @Override
    public String toString() {
        return "ReleaseDependecy{" +
                "releaseId=" + releaseId +
                ", BuildNumber='" + BuildNumber + '\'' +
                ", depedency=" + depedency +
                '}';
    }
}
