package com.xcl.springcloudlesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/* *
 * @author: xuchunlin
 * @date: 09/28/2019/13:51
 * @description:
 */
@RestController
@RequestMapping(value = "/cache")
public class CacheController {
    @Autowired
    @Qualifier("simpleCacheManager")
    private CacheManager simpleCacheManager;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Map<String,Object> save(@RequestParam("key") String key, @RequestParam("value") String value){
        Cache cache = simpleCacheManager.getCache("cache-1");
        cache.put(key, value);
        Map<String, Object> result  = new HashMap<>();
        result.put(key, value);
        return result;
    }
}
