package com.SpringASSIGNMENT.SpringAssignment1.controller;

import com.SpringASSIGNMENT.SpringAssignment1.model.CSCCourses;
import org.springframework.web.bind.annotation.*;
 import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/CSCCourses")
public class CSC {

    private List<CSCCourses> courses = new ArrayList<>(Arrays.asList(
            new CSCCourses("CSC 111F: Computer Literacy for Science", "Foundation1"),
            new CSCCourses("CSC 121F: Introduction to Programming Concepts", "Foundation2"),
            new CSCCourses("CSC 113: Introduction To Computing And Programming Concept", "Undergraduate1"),
            new CSCCourses("CSC 121: Elementary Computer Programming", "Undergraduate2"),
            new CSCCourses("CSC 211: Advanced Programming", "Undergraduate3"),
            new CSCCourses("CSC 223: Data Structures And Algorithms", "Undergraduate4"),
            new CSCCourses("CSC 313: Object Oriented Programming", "Undergraduate5"),
            new CSCCourses("CSC 501: Mini Project", "Honors1"),
            new CSCCourses("CSC 512: Computer Network", "Honors2"),
            new CSCCourses("CSC 513: Distributed And Parallel Computing", "Honors3"),
            new CSCCourses("CSC 515: Advanced Java", "Honors4")
    ));

    @GetMapping("/all")
    public List<CSCCourses> getCourses() {
        return courses;
    }
    @GetMapping("{courseLevel}")
    public CSCCourses getCourseByLevel(@PathVariable String courseLevel){
        for (CSCCourses course : courses){
            if (course.getCourseLevel().equalsIgnoreCase(courseLevel)){
                return course;
            }
        } throw new IllegalArgumentException("Invalid course lel=vel: "+ courseLevel);
    }

    @PutMapping("/{courseLevel}")
    public String updateCourse( @PathVariable String courseLevel,@Valid  @RequestBody CSCCourses updatedCourse, BindingResult result) {
        if (result.hasErrors()) {
            return result.getAllErrors().get(0).getDefaultMessage();
        }
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseLevel().equalsIgnoreCase(courseLevel)) {
                courses.set(i, updatedCourse);
                return "Course has been updated successfully.";
            }
        }
        throw new IllegalArgumentException("Course Level not found: " + courseLevel);
    }

    @DeleteMapping("/{courseLevel}")
    public String deleteCourse( @PathVariable String courseLevel) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseLevel().equalsIgnoreCase(courseLevel)) {
                courses.remove(i);
                return "Course deleted successfully.";
            }
        }
        throw new IllegalArgumentException("Course Level not found: " + courseLevel);
    }

    @PostMapping
    public String createCourse(@Valid @RequestBody CSCCourses newCourse, BindingResult result) {
        if (result.hasErrors()) {
            return result.getAllErrors().get(0).getDefaultMessage();
        }
        courses.add(newCourse);
        return "Course created successfully.";
    }
}
