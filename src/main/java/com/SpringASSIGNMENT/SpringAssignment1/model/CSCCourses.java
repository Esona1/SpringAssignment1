package com.SpringASSIGNMENT.SpringAssignment1.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CSCCourses {

    @NotBlank(message = "Course name cannot be blank")
    @Size(min = 2, max = 100, message = "Course name must be between 2 and 100 characters")
    private String CourseName;

    @NotBlank(message = "Course level cannot be blank")
    @Size(min = 2, max = 50, message = "Course level must be between 2 and 50 characters")
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
