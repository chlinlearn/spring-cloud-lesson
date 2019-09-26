package com.xcl.springcloudlesson.common;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/21/2019/14:46
 * @Description: null
 * @Version: 1.0
 */

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo implements Serializable {
    private static final long serialVersionUID = -7364260959328786496L;

    public static void main(String[] args) {
        String str = "";
        List list = new ArrayList();
        if (StringUtils.isEmpty(str)) {
            System.out.println("字符串为空");
        }
        if (list == null){
            System.out.println("集合为空:"+Collections.emptyList());
        }
    }
}
