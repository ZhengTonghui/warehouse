package com.yeqifu.sys.vo;

import com.yeqifu.sys.entity.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: 落亦-
 * @Date: 2019/12/2 8:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends User {

    private Integer page=1;
    private Integer limit=10;

    /**
     * 验证码
     */
    private String code;
    /**
     * 入职日期
     */
    private String startDate;
}
