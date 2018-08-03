package com.jdl.css.employee.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdl.css.employee.model.service.EmployeeService;
import com.jdl.css.employee.model.vo.EmployeeVo;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService eService;

	@RequestMapping("loginForm.do")
	public String openLoginForm(){
		return "index/login";
	}
	
	@RequestMapping("login.do")
	public String login(EmployeeVo e,HttpSession session){
		EmployeeVo user = eService.selectEmployeeById(e.geteId());
		System.out.println(user);
		if(user.getePwd().equals(e.getePwd())){
			session.setAttribute("user", user);
		}
		return "redirect:index.do";
	}
	
	@RequestMapping("organizationChart.do")
	public String organizationChart(){	
		return "organizationChart";
	}
	
	@RequestMapping("memberAdd.do")
	public String memberAdd(){
		return "memberAdd";
	}
	
	
	@RequestMapping("insertMember.do" )
	public String memberJoin(@RequestParam("eBirth1") String eBirth1, @RequestParam("eHireDate1") String eHireDate1, EmployeeVo member){
//		int result =eService.insertMember(member);
		
		String birth=eBirth1;
		String hire=eHireDate1;
		

		
		Date birth2 = Date.valueOf(eBirth1);
		Date hire2 = Date.valueOf(eHireDate1);

		System.out.println(birth2);
		System.out.println(hire2);
		
		member.seteBirth(birth2);
		member.seteHireDate(hire2);
		
		int result =eService.insertMember(member);
		System.out.println(member);
		
		return "redirect:organizationChart.do";
	}
	
//	@RequestMapping("insertMember.do" )
//	public String memberJoin(@RequestParam("eExten") int eExten, @RequestParam("ePhone") String ePhone){
//		
//		
//		
//		System.out.println(eExten);
//		System.out.println(ePhone);
//		
//		
//		return "redirect:organizationChart.do";
//	}
	
	
	
	
	
}
