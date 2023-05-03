package com.example.collegeentranceexaminationvolunteerrecommendation;

import com.example.collegeentranceexaminationvolunteerrecommendation.pojo.School;
import com.example.collegeentranceexaminationvolunteerrecommendation.service.impl.SchoolServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@SpringBootTest
class CollegeEntranceExaminationVolunteerRecommendationApplicationTests {
    SchoolServiceImpl schoolService;
    @Test
    void contextLoads() {
        System.out.println(11);
        School allSchool=schoolService.allSchool();
    }

}
