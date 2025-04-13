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

}
