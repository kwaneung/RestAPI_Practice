package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public boolean postService(UserVo userVo) {
        System.out.println("Post Service called");

        System.out.println("Name : " + userVo.getName());
        System.out.println("sex : " + userVo.getSex());
        System.out.println("age : " + userVo.getAge());
        System.out.println("TellPh : " + userVo.getTellPh());

        // set Max comp_cd + 1 in current users
        userVo.setCust_no(userMapper.getMaxSeq());

        System.out.println("insert User");
        userMapper.insertUser(userVo);

        return true;
    }

    public List<UserVo> getService() {
        System.out.println("Get service called");

        return userMapper.getUserList();
    }

    public boolean deleteService(UserVo userVo) {
        System.out.println("Delete Service called");

        System.out.println("Cust_no : " + userVo.getCust_no());

        System.out.println("delete User");
        userMapper.deleteUser(userVo);

        return true;
    }

    public boolean putService(UserVo userVo) {
        System.out.println("Put Service called");

        System.out.println("update User");
        userMapper.updateUser(userVo);

        return true;
    }
}
