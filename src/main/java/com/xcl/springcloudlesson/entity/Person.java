package com.xcl.springcloudlesson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/* *
 * @author: xuchunlin
 * @date: 09/28/2019/14:30
 * @description: 人
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 4670200977525549607L;

    private Long id;
    private String name;
    private int age;
}
