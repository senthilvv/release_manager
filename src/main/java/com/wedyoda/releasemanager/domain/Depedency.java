package com.wedyoda.releasemanager.domain;

public class Depedency {


    public Depedency() {
    }

    public Depedency(String name, DependecyType dependecyType) {
        this.name = name;
        this.dependecyType = dependecyType;
    }

    String name;
    DependecyType dependecyType;


    public enum DependecyType {
        MICRO_SERVICE,
        DB_DEPLOYMNET,
        JAVA_LIBRARY,
        TOOL
    }

    @Override
    public String toString() {
        return "Depedency{" +
                "name='" + name + '\'' +
                ", dependecyType=" + dependecyType +
                '}';
    }
}