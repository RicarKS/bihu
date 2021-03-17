package com.xt.bihu.enums;

public enum ErrorMessageEnum {
    USER_BLANK_ERROR(9000, "用户名不能为空"),
    PASSWORD_BLANK_ERROR(9001, "密码不能为空"),
    USER_NAME_CONTAINS_ILLEGAL_CHARACTERS_ERROR(9002, "用户名包含非法字符"),
    USER_NOT_FOUND_ERROR(9003, "用户名不存在"),
    REGISTER_ERROR(9004, "注册失败"),
    USER_NAME_OR_PASSWORD_ERROR(9005, "用户名或密码错误");


    private Integer code;
    private String message;

    ErrorMessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
