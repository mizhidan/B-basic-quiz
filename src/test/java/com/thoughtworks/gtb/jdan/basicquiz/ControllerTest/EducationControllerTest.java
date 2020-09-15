package com.thoughtworks.gtb.jdan.basicquiz.ControllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.gtb.jdan.basicquiz.Domain.Education;
import com.thoughtworks.gtb.jdan.basicquiz.Repository.EducationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EducationControllerTest {
    @Autowired
    MockMvc mockMvc;
    ObjectMapper objectMapper;
    @Autowired
    EducationRepository educationRepository;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
        educationRepository.deleteAll();
        educationRepository.init();
    }

    @Test
    public void should_return_education_info_when_given_correct_id() throws Exception {
        mockMvc.perform(get("/users/1/educations"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(2)));
    }

    @Test
    public void should_add_education_info_when_given_id() throws Exception {
        Education education = Education.builder()
                .year(2006)
                .title("Secondary school specializing in aaabbb")
                .description("I love study")
                .build();
        String request = objectMapper.writeValueAsString(education);
        mockMvc.perform(post("/users/1/educations").contentType(MediaType.APPLICATION_JSON).content(request))
                .andExpect(status().isCreated());
    }
}
