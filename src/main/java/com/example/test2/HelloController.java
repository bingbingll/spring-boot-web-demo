package com.example.test2;

import com.terran4j.commons.api2doc.annotations.Api2Doc;
import com.terran4j.commons.api2doc.annotations.ApiComment;
import com.terran4j.commons.api2doc.annotations.ApiError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO description：
 *
 * @author 李兵
 * @version v1.0
 * @CreateDate: 2019/1/8 16:12
 */
@Api2Doc(id = "hello",name = "测试接口类名",order = 2)
@ApiComment(seeClass = Hello.class)
@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @Api2Doc(order = 1)
    @ApiComment("新增用户api方法")
    @ApiError(value = "/save",comment = "已存在")
    @PostMapping(name = "新增用户map方法",value = "/save")
    public Hello save(@ApiComment("填写信息，hello 实体类") @RequestBody Hello hello){
        Hello hello1=new Hello();
        hello1.setId("111");
        return hello1;
    }
}
