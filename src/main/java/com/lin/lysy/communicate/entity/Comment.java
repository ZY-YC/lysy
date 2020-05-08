package com.lin.lysy.communicate.entity;

import com.lin.lysy.index.entity.User;

import java.util.Date;

public class Comment{
    /**
     *  用户的id 账户
     * */
    private String userId;
    /**
     * 评论人的id账户
     * */
    private String commentId;
    /**
     * 评论内容
     * */
    private String com_content;
    /**
     * 评论日期
     * */
    private Date com_data;
}