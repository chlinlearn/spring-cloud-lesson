package com.xcl.springcloudlesson.cache;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/* *
 * @author: xuchunlin
 * @date: 09/28/2019/13:59
 * @description:
 */
@Configuration
@EnableCaching
public class CacheConfiguration {
    @Bean
    public CacheManager simpleCacheManager(){
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        ConcurrentMapCache cache = new ConcurrentMapCache("cache-1");
        simpleCacheManager.setCaches(Collections.singleton(cache));
        return simpleCacheManager;
    }
}
