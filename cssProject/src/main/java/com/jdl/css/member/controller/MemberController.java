package com.jdl.css.member.controller;

import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.member.model.service.MemberService;
import com.jdl.css.member.model.vo.Member;



@Controller
public class MemberController {
//	@Autowired
//	MemberService memberService;
	
	@RequestMapping("organizationChart.do")
	public String organizationChart(){	
		return "organizationChart";
	}
	
	@RequestMapping("memberAdd.do")
	public String memberAdd(){
		return "memberAdd";
	}
	
	
	@RequestMapping("join.do" )
	public String memberJoin(Member member){
		int result =MemberService.insertMember(member);
		
		
		
		return "redirect:organizationChart.do";
	}
	
	
	
	
	
	
}



