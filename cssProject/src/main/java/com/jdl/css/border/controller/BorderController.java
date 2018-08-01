package com.jdl.css.border.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.border.model.service.BorderService;
import com.jdl.css.border.model.vo.BorderVo;

@Controller
public class BorderController {

	@Autowired
	BorderService borderservice;
	
	@RequestMapping("borderList.do")
	public ModelAndView boaderList(BorderVo bodrder, ModelAndView mv){
		
		List<BorderVo> list = borderservice.getNoticeList();
		if(list != null){
			mv.addObject("list", list);
			mv.setViewName("border/borderList");
		}
		System.out.println(list);
		return mv;
	}
}
