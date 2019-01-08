package com.example.test;

import com.terran4j.commons.api2doc.annotations.ApiComment;

/**
 * TODO description：
 *
 * @author 李兵
 * @version v1.0
 * @CreateDate: 2019/1/8 16:06
 */

public enum UserType {
    @ApiComment("管理员")
    admin,

    @ApiComment("普通用户")
    user
}
