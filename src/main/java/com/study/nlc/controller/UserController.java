package com.study.nlc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    // TODO login
    @RequestMapping(value="/userInfo/login")
    public ModelAndView userLogin(HttpServletRequest rq , HttpServletResponse rd) {
        ModelAndView mav = new ModelAndView();
        // 조회시 성공이면 메인페이지 이동 url
        // 실패시 실패 메시지 전달
        return mav;
    }

    // joinPage
    @RequestMapping(value="/userInfo/getJoinPage")
    public String getJoinPage(HttpServletRequest rq , HttpServletResponse rd) {
        return "";
    }

    // join
    @RequestMapping(value="/userInfo/setJoinMember")
    public ModelAndView setJoinMember(HttpServletRequest rq , HttpServletResponse rd) {
        ModelAndView mav = new ModelAndView();
        return mav;
    }
}
