package com.example.demo.dto;

import lombok.Data;

@Data
public class CommentDTO {
    private Integer id;
    private Long parentId;
    private String content;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
}
