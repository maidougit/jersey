package com.maicheng.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2017-2018, maicheng Technology Co. Ltd
 * FileName: RestResource.java
 * Author:   maidou
 * Date:     2018-07-03 0:24
 * Description:
 */
@Path("/")
public class RestResource {
    @Path("/hello") // 具体路径
    @GET // 请求方式
    @Produces(MediaType.APPLICATION_JSON) // 返回的格式
    // @Consumes()//接受指定的MIME格式
    public Map<String, Object> hello() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "1");
        map.put("codeMsg", "success");
        map.put("user", "小左");
        return map;
    }
}