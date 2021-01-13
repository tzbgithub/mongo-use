package com.tzb.mongo.config;

/**
 * Create by zhatang on 2021/1/12.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.tzb.mongo.mbg.mapper"})
public class MyBatisConfig {
}
