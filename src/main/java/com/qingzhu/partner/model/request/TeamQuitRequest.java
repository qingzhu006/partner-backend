package com.qingzhu.partner.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author qingzhu
 */
@Data
public class TeamQuitRequest implements Serializable {



    private static final long serialVersionUID = -9177404376080570221L;

    /**
     * id
     */
    private Long teamId;

}
