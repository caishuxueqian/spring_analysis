package com.jiyu.v4.ServiceImpl;

import com.jiyu.v4.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author jiyu
 * @date 2020/11/07 10:14
 */
@Service
public class UserService002Impl implements UserService {
    public void add() {
        System.out.println("UserService002Impl");
    }
}
