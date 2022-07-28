package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//完全注解配置的实现
@Configuration
@ComponentScan(basePackages = {"com.atguigu"} )
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
