package com.example.demo.module.wechatUser.controller;

import com.example.demo.core.base.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/wechat")
public class WechatUserController extends BaseController{

    /**
     * 查询微信用户信息
     */
    @GetMapping(value = "/user")
    public ModelAndView wechatUser() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("openId","asdasdf");
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
