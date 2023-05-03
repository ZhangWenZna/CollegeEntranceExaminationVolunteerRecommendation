-- 创建学校表
CREATE TABLE school (
                        school_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '学校ID，主键',
                        province VARCHAR(20) COMMENT '学校所在省份',
                        school_name VARCHAR(50) COMMENT '学校名称',
                        school_type VARCHAR(20) COMMENT '学校类型（985、211、普通本科等）',
                        school_level VARCHAR(20) COMMENT '学校层次（本科、专科等）',
                        PRIMARY KEY (school_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学校表';

-- 创建专业表
CREATE TABLE major (
                       major_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '专业ID，主键',
                       major_name VARCHAR(50) COMMENT '专业名称',
                       school_id INT UNSIGNED COMMENT '该专业所属学校ID，外键',
                       major_type VARCHAR(20) COMMENT '专业类型（本科、专科等）',
                       major_level VARCHAR(20) COMMENT '专业层次（本科、专科等）',
                       major_score FLOAT COMMENT '该专业录取分数线',
                       PRIMARY KEY (major_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='专业表';

-- 创建考生表
CREATE TABLE examinee (
                          examinee_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '考生ID，主键',
                          examinee_name VARCHAR(50) COMMENT '考生姓名',
                          examinee_province VARCHAR(20) COMMENT '考生所在省份',
                          examinee_score FLOAT COMMENT '考生分数',
                          examinee_subject VARCHAR(20) COMMENT '考生所学科别',
                          PRIMARY KEY (examinee_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='考生表';

-- 创建推荐结果表
CREATE TABLE recommendation (
                                recommendation_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '推荐结果ID，主键',
                                examinee_id INT UNSIGNED COMMENT '推荐结果所属考生ID，外键',
                                school_id INT UNSIGNED COMMENT '推荐结果学校ID，外键',
                                major_id INT UNSIGNED COMMENT '推荐结果专业ID，外键',
                                PRIMARY KEY (recommendation_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='推荐结果表';

-- 创建高考数据表
CREATE TABLE exam_data (
                           data_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '高考数据ID，主键',
                           school_id INT UNSIGNED COMMENT '高考数据所属学校ID，外键',
                           year INT COMMENT '高考数据年份',
                           science FLOAT COMMENT '理科录取分数线',
                           liberal_arts FLOAT COMMENT '文科录取分数线',
                           PRIMARY KEY (data_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='高考数据表';

-- 创建用户表
CREATE TABLE user (
                      user_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户ID，主键',
                      username VARCHAR(20) COMMENT '用户名',
                      password VARCHAR(20) COMMENT '用户密码',
                      user_type VARCHAR(20) COMMENT '用户类型（管理员、普通用户等）',
                      PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';