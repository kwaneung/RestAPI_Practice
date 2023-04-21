package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService apiservice;

    @PostMapping("/user")
    public Map<String, Object> userAjaxPost(UserVo userVo) {
        System.out.println("========== /user POST Controller Start ==========");

        Map<String, Object> result = new HashMap<>();

        try {
            apiservice.postService(userVo);
            result.put("code", "0000");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "9999");
        }

        System.out.println("========== /user POST Controller End ==========");
        return result;
    }

    @GetMapping("/user")
    public Map<String, Object> userAjaxGet(UserVo userVo) {
        System.out.println("========== /user GET Controller Start ==========");

        System.out.println(userVo.getCust_no());
        System.out.println(userVo.getName());
        System.out.println(userVo.getSex());
        System.out.println(userVo.getAge());
        System.out.println(userVo.getTellPh());

        Map<String, Object> result = new HashMap<>();
        List<UserVo> userVoList = new ArrayList<>();

        try {
            if (userVo.getCust_no() == null) {
                System.out.println("userVo is null");
                userVoList = apiservice.getService();
                result.put("code", "0000");
            } else {
                System.out.println("userVo is not null");
            }

            //Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "9999");
        }

        result.put("code", "0000");
        result.put("userList", userVoList);

        System.out.println("========== /user GET Controller End ==========");
        return result;
    }

    @DeleteMapping("/user")
    public Map<String, Object> userAjaxDelete(UserVo userVo) {
        System.out.println("========== /user DELETE Controller Start ==========");

        Map<String, Object> result = new HashMap<>();

        try {
            apiservice.deleteService(userVo);
            result.put("code", "0000");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "9999");
        }

        System.out.println("========== /user DELETE Controller End ==========");
        return result;
    }

    @PutMapping("/user")
    public Map<String, Object> userAjaxUpdate(UserVo userVo) {
        System.out.println("========== /user PUT Controller Start ==========");

        Map<String, Object> result = new HashMap<>();

        try {
            apiservice.putService(userVo);
            result.put("code", "0000");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "9999");
        }

        System.out.println("========== /user PUT Controller End ==========");
        return result;
    }
}
