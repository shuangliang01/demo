package com.example.demo.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"Topic not exist"),
    TARGET_PARAM_NOT_FOUND(2002, "Topic/Comment not found"),
    NO_LOGIN(2003, "Please login"),
    SYS_ERROR(2004, "Server Error"),
    TYPE_PARAM_WRONG(2005, "Type not exist"),
    COMMENT_NOT_FOUND(2006, "Comment not found"),
    CONTENT_IS_EMPTY(2007, "Content is empty"),
    READ_NOTIFICATION_FAIL(2008, "Access deny"),
    NOTIFICATION_NOT_FOUND(2009, "Message not found"),
    FILE_UPLOAD_FAIL(2010, "File upload fail"),
    INVALID_INPUT(2011, "Invalid input"),
    INVALID_OPERATION(2012, "invalid operation"),
    USER_DISABLE(2013, "Access deny, please contact admin"),
    RATE_LIMIT(2014, "Server busy, please try later");

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {

        this.message = message;
        this.code = code;
    }
}
