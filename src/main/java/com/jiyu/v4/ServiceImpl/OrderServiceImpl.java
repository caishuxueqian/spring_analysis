package com.jiyu.v4.ServiceImpl;

import com.jiyu.v4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @author jiyu
 * @date 2020/11/07 10:23
 */
@Component
public class OrderServiceImpl {


    @Autowired
    //@Resource(name = "userService001Impl")
    // @Qualifier("userService002Impl")
    private UserService userService;

    public void add() {
        userService.add();
    }

}
