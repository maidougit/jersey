package com.maicheng.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Copyright (C), 2017-2018, maicheng Technology Co. Ltd
 * FileName: JerseyResourceConfig.java
 * Author:   maidou
 * Date:     2018-07-03 0:22
 * Description: 继承ResourceConfig,并添加一些配置信息
 */
public class JerseyResourceConfig extends ResourceConfig {

    public JerseyResourceConfig() {
        register(RequestContextFilter.class);
        // 配置那个包下面的会被Jersey扫描
        packages("com.maicheng.jersey");
    }
}