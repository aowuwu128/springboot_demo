package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

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
