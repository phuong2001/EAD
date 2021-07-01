package com.example.demo.model;

public class BaseResponse<T> {
    private int code;
    public String message = "success";
    public T data;
}
