package com.example.elklog.common;

/**
 * 封装API的错误码
 * Created by 酌客 on 2022/4/21.
 * 
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
