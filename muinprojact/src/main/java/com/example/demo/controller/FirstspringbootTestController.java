package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstspringbootTestController {
   
   @RequestMapping("/")
   public ModelAndView index(){
      ModelAndView mv = new ModelAndView();
      mv.setViewName("index");
      return mv;
      }
   @RequestMapping("/myPage")
   public ModelAndView myPage() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("myPage/myPage"); // 경로와 뷰 이름 설정
       return mv;
   }
   @RequestMapping("/register")
   public ModelAndView register() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("register/register"); // 경로와 뷰 이름 설정
       return mv;
   }
   @RequestMapping("/login")
   public ModelAndView login() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("login/login"); // 경로와 뷰 이름 설정
       return mv;
   }
   @RequestMapping("/upload")
   public ModelAndView upload() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("upload/upload"); // 경로와 뷰 이름 설정
       return mv;
   }
   @RequestMapping("/categoryMenu")
   public ModelAndView categoryMenu() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("cate/categoryMenu"); // 경로와 뷰 이름 설정
       return mv;
   }
   @RequestMapping("/categoryPage")
   public ModelAndView categoryPage() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("cate/categoryPage"); // 경로와 뷰 이름 설정
       return mv;
   }
   
}