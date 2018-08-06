package com.jdl.css.admin.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.admin.model.service.AdminService;


@Controller
public class AdminController {
	@Autowired
	AdminService service;
	
	@RequestMapping("memberList.do")
	public ModelAndView memberList(ModelAndView mv){

		return mv;
	}
}
