package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserVo> getUserList();
    void insertUser(UserVo userVo);
    void deleteUser(UserVo userVo);
    void updateUser(UserVo userVo);
    String getMaxSeq();
}
