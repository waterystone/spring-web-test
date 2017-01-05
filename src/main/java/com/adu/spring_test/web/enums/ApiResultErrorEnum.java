package com.adu.spring_test.web.enums;

/**
 * @author yunjie.du
 * @date 2017/1/5 11:00
 */
public enum ApiResultErrorEnum {
    ARGUMENT_ERROR(-10, "参数错误"),
    SERVER_ERROR(-5, "内部错误"),
    UNKNOWN_ERROR(-1, "未知错误"),
    SUCC(200, "成功");

    private final int code;
    private final String desc;

    ApiResultErrorEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ApiResultErrorEnum codeOf(int code) {
        for (ApiResultErrorEnum apiResultErrorEnum : ApiResultErrorEnum.values()) {
            if (apiResultErrorEnum.code == code) {
                return apiResultErrorEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
