package com.thoughtworks.gtb.jdan.basicquiz.ControllerTest;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.Education;
import com.thoughtworks.gtb.jdan.basicquiz.Service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {
    @Autowired
    EducationService educationService;

    @GetMapping("/users/{id}/educations")
    public ResponseEntity<List<Education>> getEducations(@PathVariable Integer id) {
        return ResponseEntity.ok(educationService.getEducations(id));
    }
}
