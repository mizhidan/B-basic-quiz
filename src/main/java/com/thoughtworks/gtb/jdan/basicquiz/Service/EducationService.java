package com.thoughtworks.gtb.jdan.basicquiz.Service;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.Education;
import com.thoughtworks.gtb.jdan.basicquiz.Repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getEducations(Integer id) {
        return educationRepository.getEducationsById(id);
    }

    public void addEducations(Integer id, Education education) {
        educationRepository.addEducations(id, education);
    }
}
