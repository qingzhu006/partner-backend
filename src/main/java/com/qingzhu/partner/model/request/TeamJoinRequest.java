package com.qingzhu.partner.model.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author qingzhu
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = -9177404376080570221L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
