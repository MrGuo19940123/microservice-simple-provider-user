package com.leo.microservicesimpleprovideruser.domain;

import java.util.Objects;

/**
 * 统一日志处理类
 * Http请求返回的最外层对象
 */
public class HttpResult<T> {

    // 错误码
    private String InterfaceCode;

    // 提示信息
    private String InterfaceMsg;

    // 具体的内容
    private T InterfaceBody;

    public String getInterfaceCode() {
        return InterfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        InterfaceCode = interfaceCode;
    }

    public String getInterfaceMsg() {
        return InterfaceMsg;
    }

    public void setInterfaceMsg(String interfaceMsg) {
        InterfaceMsg = interfaceMsg;
    }

    public T getInterfaceBody() {
        return InterfaceBody;
    }

    public void setInterfaceBody(T interfaceBody) {
        InterfaceBody = interfaceBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpResult<?> that = (HttpResult<?>) o;
        return Objects.equals(InterfaceCode, that.InterfaceCode) &&
                Objects.equals(InterfaceMsg, that.InterfaceMsg) &&
                Objects.equals(InterfaceBody, that.InterfaceBody);
    }

    @Override
    public int hashCode() {

        return Objects.hash(InterfaceCode, InterfaceMsg, InterfaceBody);
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "InterfaceCode=" + InterfaceCode +
                ", InterfaceMsg='" + InterfaceMsg + '\'' +
                ", InterfaceBody=" + InterfaceBody +
                '}';
    }
}
