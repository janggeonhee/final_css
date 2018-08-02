package com.jdl.css.border.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.border.model.service.BorderService;
import com.jdl.css.border.model.vo.BorderVo;

@Controller
public class BorderController {

	@Autowired
	BorderService borderservice;
	
	@RequestMapping("borderList.do")
	public ModelAndView boaderList(String bCateGory, ModelAndView mv){
		
		List<BorderVo> list = borderservice.getNoticeList(bCateGory);
		if(list != null){
			mv.addObject("list", list);
			mv.addObject("bCateGory",bCateGory);
			mv.setViewName("border/borderList");
		}
		System.out.println(list);
		return mv;
	}
	
	@RequestMapping("borderForm.do")
	public ModelAndView borderForm(BorderVo board, ModelAndView mv){
		
		mv.addObject("board", board);
		mv.setViewName("border/borderForm");
		return mv;
	}
	
	@RequestMapping("writeBoard.do")
	public ModelAndView writeBoard(BorderVo board, ModelAndView mv){
		
			int result = borderservice.writeBoard(board);
			System.out.println("dao다오" + board);
			if(result > 0){
				mv.setViewName("redirect:borderList.do");
			}
		return mv;
	}
}
