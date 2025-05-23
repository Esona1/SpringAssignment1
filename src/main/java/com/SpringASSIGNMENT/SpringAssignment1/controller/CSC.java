package com.SpringASSIGNMENT.SpringAssignment1.controller;

import com.SpringASSIGNMENT.SpringAssignment1.model.CSCCourses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/CSCCourses")
public class CSC {
    CSCCourses cscCourses;

    private List<CSCCourses> courses= new ArrayList<>(Arrays.asList(
        new CSCCourses("CSC 111F: Computer Literacy for Science","Foundation"),
         new CSCCourses("CSC 121F: Introduction to Programming Concepts","Foundation"),
         new CSCCourses("CSC 113: Introduction To Computing And Programming Concept","Undergraduate"),
         new CSCCourses("CSC 121: Elementary Computer Programming","Undergraduate"),
         new CSCCourses("CSC 211: Advanced Programming","Undergraduate"),
         new CSCCourses("CSC 223: Data Structures And Algorithms","Undergraduate"),
         new CSCCourses("CSC 313: Object oriented Programming","Undergraduate"),
         new CSCCourses("CSC 501: Mini Project","Honors"),
         new CSCCourses("CSC 512: Computer Network","Honors"),
         new CSCCourses("CSC 513: Distributed And Parallel Computing","Honors"),
        new CSCCourses("CSC 515: Advanced Java","Honors")
        

    ));
    @GetMapping("/all")
    public List<CSCCourses> getCourses(){
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
    @PutMapping("{courseLevel}")
    public String updateCourse(@PathVariable String courseLevel, @Valid @RequestBody CscCourses updatedCourses,BindingResult result){
        if(result.hasErrors()){
            return result.getAllErrors().get(0).getDefaultMessage();
        }
        for (int i = 0; i ‹ courses.size(); i++) {
if (courses.get(i).getCourseLevel().equalsIgnorecase(courseLevel)) {
courses. set (1, updatedCourse);
return "Course has been updated successfully.";
}
        }
        throw new IllegalArguementException("Course Level was not found:" + courseLevel);
    }
@DeleteMapping("{courseLevel}")
    public String deleteCourse(@PathVariable String courseLevel) {
        for (int i = 0; i< courses.size(); i++) {
            if (courses.get(i).getCourseLevel().equalsIgnoreCase(courseLevel)) {
                courses.remove(i);
                return "Course deleted successfully.";
            }
        }
        throw new IllegalArgumentException("Course type not found: " + courseLevel);
    }
    
}
@PostMapping
    public String createCourse(@Valid @RequestBody CscCourses new Courses , BindingResult)
    if (result.hasErrors()){
    return result.getAllErrors().get(0).getDefauktMaddage();
}  
courses.add(newCourse);
return "Course created successfully";
    }

