package com.example.collegeentranceexaminationvolunteerrecommendation.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专业表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("major")
@AllArgsConstructor
public class Major {
    /**
     *专业ID
     */
    private Integer majorId;
    /**
     *专业名称
     */
    private String majorName;
    /**
     *该专业所属学校ID
     */
    private Integer SchoolId;
    /**
     *专业类型
     */
    private String majorType;
    /**
     *专业层次（本科、专科等）
     */
    private String majorLerel;
    /**
     *该专业录取分数线
     */
    private Double majorScore;

}
