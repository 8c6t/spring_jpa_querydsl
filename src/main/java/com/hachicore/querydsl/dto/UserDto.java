package com.hachicore.querydsl.dto;

import lombok.Data;

@Data
public class UserDto {

    private String name;
    private Integer age;

    public UserDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
