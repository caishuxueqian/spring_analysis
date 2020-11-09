package com.jiyu.v4.service;

/**
 * @author jiyu
 * @date 2020/11/07 10:12
 *
 * 假设一个接口下有两个实现类，这时候使用@Autowired获取的时候
 * UserService
 * UserService001Impl
 * UserService002Impl
 *
 *  @Autowired
 *  UserService
 *
 * 因为@Autowired默认的情况下使用 类型查找
 * SpringBoot 多数据源 设置默认的时候（优先级）
 */
public interface UserService {
    void add();
}
