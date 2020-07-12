package com.layui.ssm.controller.user;

import com.layui.ssm.domain.user.User;
import com.layui.ssm.service.user.IUserService;
import layui.ssm.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     *  注册，根据用户名注册
     * @return
     */
    @RequestMapping("/reg.do")
    @ResponseBody
    public ResponseUtil<User> register(@RequestBody User user) {
         userService.addUser(user);
         return new ResponseUtil<>(0,user);
    }

}
