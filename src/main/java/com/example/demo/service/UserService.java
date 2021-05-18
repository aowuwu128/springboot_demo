package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    //查找所有
    List<User> findAll();

    //根据id查找
    List<User> findById(int id);

    //增加
    void create(User user);

    //根据删除
    void delete(int id);

    //更新
    void update(User user);
}
