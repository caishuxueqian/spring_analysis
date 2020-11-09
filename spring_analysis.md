# spring_analysis
蚂蚁课堂Spring5.0源码解析随堂练习
## 2.4 **@Enablexxx**功能性注解实现原理
    @Enablexxx：开启某某功能 为什么一加入@Enablexxx注解就会自动注入bean，
    底层实现是使用了@Import注解，导包，把bean注入到IOC容器中。
    
        /**
        * Import作用主要讲外部的jar包注入到springioc容器 @Import(Win10Entity.class) 等于 @Bean
        * Import注册的bean对象 id为当前类全路径
        */
        
         /**
         * @Import注解与@Bean注解的区别
         * bean注解注册的bean的id是方法名称 @Import以当前类完整路径地址注册 相比来说@Import注入更加简单
         * 共同点：都是引入外部的jar包
         */
         
         // @Configuration等同于spring xml
         
         /**
         *  @Bean 等同于 xml中的<bean></bean>
         * <bean id="userEntity" class="com.jiyu.entity.UserEntity">
         *    id: 方法名userEntity
         *    class：UserEntity
         */
 
 ## 2.9 假设一个接口下有两个实现类，这时候使用@Autowired获取的时候会有什么问题？怎么解决？
 > /**
    * 假设一个接口下有两个实现类，这时候使用@Autowired获取的时候
    * UserService
    * UserService001Impl
    * UserService002Impl
    * 
    * @Autowired
    * UserService
    * 
    * 因为@Autowired默认的情况下使用 类型查找
    * SpringBoot 多数据源 设置默认的时候（优先级）@Primary
    */
    
    
    解决办法有三种：
         1、
         
           @Resource(name = "userService001Impl")
           private UserService userService;
       
         
         2、
          @Autowired
          @Qualifier("userService002Impl")      
          private UserService userService;
        
         3、    
          @Autowired 
          private UserService userService;
          
          //在实现类加上@Primary注解
          @Primary
          UserService001Impl
          
          