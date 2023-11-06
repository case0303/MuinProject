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
	
}
