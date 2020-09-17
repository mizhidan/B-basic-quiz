package com.thoughtworks.gtb.jdan.basicquiz.ControllerTest;
// GTB: - ↑ package name 里一般不会使用大写字母
// GTB: - 这里的 package name 怎么还是 xxxTest ？
import com.thoughtworks.gtb.jdan.basicquiz.Domain.Education;
import com.thoughtworks.gtb.jdan.basicquiz.Exception.EducationException;
import com.thoughtworks.gtb.jdan.basicquiz.Service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class EducationController {
    @Autowired
    EducationService educationService;

    @GetMapping("/users/{id}/educations")
    public ResponseEntity<List<Education>> getEducations(@PathVariable Integer id) throws EducationException {
        return ResponseEntity.ok(educationService.getEducations(id));
    }

    @PostMapping("users/{id}/educations")
    public ResponseEntity<String> addEducations(@PathVariable Integer id, @Valid @RequestBody Education education) {
        educationService.addEducations(id, education);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
