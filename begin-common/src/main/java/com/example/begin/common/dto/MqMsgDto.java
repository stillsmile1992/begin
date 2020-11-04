package com.example.begin.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @project cloudlike
 * @description
 * @author 徐天麒
 * @createTime 2020/11/3 10:15
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MqMsgDto implements Serializable {
    private long id;
    private int type;
    private Object data;
}
