package com.w2x.springboot.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "users")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;

    private String username;

    private int age;

    private String gender;
}
