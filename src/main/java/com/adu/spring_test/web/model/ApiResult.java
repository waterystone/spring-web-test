package com.adu.spring_test.web.model;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA. User: xiaofeng.ma Date: 12-10-11 Time: 下午5:13 To
 * change this template use File | Settings | File Templates.
 */
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = 4637459385621476082L;

    private int status;
    private String msg;
    private T data;

    public ApiResult() {
    }

    public ApiResult(int status, String msg, T result) {
        this.status = status;
        this.msg = msg;
        this.setData(result);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ApiResult<T> buildSuccessDataApiResult(T data) {
        ApiResult<T> apiResult = new ApiResult<T>();
        apiResult.data = data;
        apiResult.msg = "success";
        apiResult.status = 200;
        return apiResult;
    }

    @Override
    public String toString() {
        return "ApiResult [status=" + status + ", msg=" + msg + ", data="
                + data + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((msg == null) ? 0 : msg.hashCode());
        result = prime * result + status;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ApiResult other = (ApiResult) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (msg == null) {
            if (other.msg != null)
                return false;
        } else if (!msg.equals(other.msg))
            return false;
        if (status != other.status)
            return false;
        return true;
    }
}

final class ReadOnlyApiResult extends ApiResult<Object> {

    ReadOnlyApiResult(int status, String errmsg, Object result) {
        super(status, errmsg, result);
    }

    public void setStatus(boolean status) {
        throw new UnsupportedOperationException("unsupport set");
    }

    public void setMsg(String errmsg) {
        throw new UnsupportedOperationException("unsupport set");
    }

    public void setErrcode(int errcode) {
        throw new UnsupportedOperationException("unsupport set");
    }

    public void setResult(Object result) {
        throw new UnsupportedOperationException("unsupport set");
    }
}
