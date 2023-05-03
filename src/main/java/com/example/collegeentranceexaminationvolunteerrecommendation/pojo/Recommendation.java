package com.example.collegeentranceexaminationvolunteerrecommendation.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 推荐结果表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("recommendation")
@AllArgsConstructor
public class Recommendation {
    /**
     * 推荐结果ID
     */
    private Integer recommendationId;
    /**
     * 推荐结果所属考生ID
     */
    private Integer examineeId;
    /**
     * 推荐结果学校ID
     */
    private Integer schoolId;
    /**
     * 推荐结果专业ID
     */
    private Integer majorId;

}
