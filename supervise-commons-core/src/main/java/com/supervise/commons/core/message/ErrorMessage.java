package com.supervise.commons.core.message;


/**
 * TODO
 *
 */
public class ErrorMessage extends Message {

    private String errMsg="操作失败";

    private Object data;

    public ErrorMessage() {
        super(Message.FAILURE);
    }

    public ErrorMessage(int code) {
        super(code);
    }

    public ErrorMessage(String errorMsg) {
        super(Message.FAILURE);
        this.errMsg = errorMsg;
    }

    public ErrorMessage(int code, String errorMsg) {
        super(code);
        this.errMsg = errorMsg;
    }


    public ErrorMessage(ResultTypeEnum resultType) {
        super(resultType.getFlag());
        this.errMsg = resultType.getRemark();
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }


    public ErrorMessage(Object data) {
        super(Message.FAILURE);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
