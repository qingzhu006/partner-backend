package com.qingzhu.partner.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author qingzhu
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -9177404376080570221L;

    private String userAccount;

    private String userPassword;
}
