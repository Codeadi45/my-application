package com.example.myapp;





public class model {

    private String course;
    private String name;
    private String url,faculty;

    model() {
    }

    public model(String course,String name,String url,String faculty) {
        this.course = course;
        this.name = name;
        this.url = url;
        this.faculty = faculty;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
