package com.will.aop.springAopDemo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.will.aop")
@EnableAspectJAutoProxy
//@EnableAutoConfiguration
public class Config {
}
