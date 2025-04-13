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
        new CSCCourses("CSC513-Advanced Java Programming","Honors"),
        new CSCCourses("CSC513-Advanced Java Programming","Honors"),
            new CSCCourses("CSC513-Advanced Java Programming","Honors")

    ));
    @GetMapping("/all")
    public List<CSCCourses> getCourses(){
        return courses;
    }

}
