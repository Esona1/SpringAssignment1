package com.SpringASSIGNMENT.SpringAssignment1.model;

public class CSCCourses {
    private String CourseName;
    private String CourseLevel;

    public CSCCourses(String courseName, String courseLevel) {
        CourseName = courseName;
        CourseLevel = courseLevel;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getCourseLevel() {
        return CourseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        CourseLevel = courseLevel;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
