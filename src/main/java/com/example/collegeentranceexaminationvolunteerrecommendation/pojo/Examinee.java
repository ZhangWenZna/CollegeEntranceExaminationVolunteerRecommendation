package com.example.collegeentranceexaminationvolunteerrecommendation.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 考生表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("examinee")
@AllArgsConstructor
public class Examinee {
    /**
     * 考生ID
     */
    private Integer examineeId;
    /**
     *考生姓名
     */
    private String examineeName;
    /**
     *考生所在省份
     */
    private String examineeProvince;
    /**
     *考生分数
     */
    private Double examineeScore;
    /**
     *考生所学科别
     */
    private String examineeSubject;

}
