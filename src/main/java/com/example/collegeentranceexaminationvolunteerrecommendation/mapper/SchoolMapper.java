package com.example.collegeentranceexaminationvolunteerrecommendation.mapper;

import com.example.collegeentranceexaminationvolunteerrecommendation.pojo.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {

    public School allSchool();
}
