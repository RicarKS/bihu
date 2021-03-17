package com.xt.bihu.DTO;

import com.xt.bihu.enums.ErrorMessageEnum;
import lombok.Data;

@Data
public class ResultDTO {
    private int code;
    private String message;
    private Object data;

    public static ResultDTO valueOf(int code, String message) {
        return new ResultDTO(code, message);
    }

    public static ResultDTO success() {
        return new ResultDTO(200, "请求成功");
    }

    public static ResultDTO successOf(Object data) {
        ResultDTO resultDTO = ResultDTO.success();
        resultDTO.setData(data);
        return resultDTO;
    }

    public static ResultDTO error(ErrorMessageEnum errorMessageEnum){
        return new ResultDTO(errorMessageEnum.getCode(), errorMessageEnum.getMessage());
    }

    private ResultDTO(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
