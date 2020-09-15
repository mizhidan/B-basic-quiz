package com.thoughtworks.gtb.jdan.basicquiz.Repository;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.Education;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EducationRepository {
    List<Education> educationList = new ArrayList<>();

    EducationRepository() {
        educationList.add(
                Education.builder()
                        .userId(1)
                        .year(2005)
                        .title("Secondary school specializing in artistic")
                        .description("Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus.")
                        .build());
        educationList.add(
                Education.builder()
                        .userId(1)
                        .year(2009)
                        .title("First level graduation in Graphic Design")
                        .description("Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Iusto, quibusdam asperiores unde repellat.")
                        .build());
    }

    public List<Education> getEducationsById(Integer id) {
        List<Education> userEducationList = new ArrayList<>();
        for (Education education : educationList) {
            if (education.getUserId() == id) {
                userEducationList.add(education);
            }
        }
        return  userEducationList;
    }
}
