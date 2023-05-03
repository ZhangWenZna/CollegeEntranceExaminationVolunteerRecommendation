package com.example.collegeentranceexaminationvolunteerrecommendation.service.impl;

import com.example.collegeentranceexaminationvolunteerrecommendation.mapper.SchoolMapper;
import com.example.collegeentranceexaminationvolunteerrecommendation.pojo.School;
import com.example.collegeentranceexaminationvolunteerrecommendation.service.SchoolService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolServiceImpl implements SchoolService {
    SchoolMapper schoolMapper;
    @Override
    public School allSchool() {
        return schoolMapper.allSchool();
    }
}
