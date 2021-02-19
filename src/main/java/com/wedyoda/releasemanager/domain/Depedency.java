package com.wedyoda.releasemanager.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Depedency)) return false;
        Depedency depedency = (Depedency) o;
        return Objects.equals(name, depedency.name) &&
                dependecyType == depedency.dependecyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dependecyType);
    }
}