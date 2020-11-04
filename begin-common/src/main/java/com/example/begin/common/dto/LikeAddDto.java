package com.example.begin.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project cloudlike
 * @description
 * @author 徐天麒
 * @createTime 2020/11/1 17:57
 * @version 1.0
 */
public class LikeAddDto {
    private int uid;
    private int cid;

    public LikeAddDto() {
    }

    public LikeAddDto(int uid, int cid) {
        this.uid = uid;
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "LikeAddDto{" +
                "uid=" + uid +
                ", cid=" + cid +
                '}';
    }
}
