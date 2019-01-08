package com.example.test;

import com.terran4j.commons.api2doc.annotations.ApiComment;
import com.terran4j.commons.restpack.RestPackIgnore;
import lombok.Data;

import java.util.Date;

/**
 * TODO description：
 *
 * @author 李兵
 * @version v1.0
 * @CreateDate: 2019/1/8 16:05
 */
@Data
public class User {
    @ApiComment(value = "用户id", sample = "123")
    private Long id;

    @ApiComment(value = "用户名", sample = "terran4j")
    private String name;

    @ApiComment(value = "账号密码", sample = "sdfi23skvs")
    private String password;

    @ApiComment(value = "用户所在的组", sample = "研发组")
    private String group;

    @ApiComment(value = "用户类型", sample = "admin")
    private UserType type;

    @ApiComment(value = "是否已删除", sample = "true")
    @RestPackIgnore
    private Boolean deleted;

    @ApiComment(value = "创建时间\n也是注册时间。")
    private Date createTime;
}
