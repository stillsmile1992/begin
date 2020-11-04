package com.example.begin.common.vo;

import lombok.Data;

/**
 * @author 徐天麒
 * @version 1.0
 * @project kataba
 * @description
 * @createTime 2020/10/19 17:08
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> Result setR(int c, String m, T obj) {
        Result result = new Result();
        result.setCode(c);
        result.setData(obj);
        result.setMsg(m);
        return result;
    }

    public static Result ok() {
        return setR(1, "OK", null);
    }

    public static <T> Result ok(T t) {
        return setR(1, "OK", t);
    }

    public static Result fail() {
        return setR(2, "FAIL", null);
    }

    public static <T> Result fail(T t) {
        return setR(2, "FAIL", t);
    }
}
