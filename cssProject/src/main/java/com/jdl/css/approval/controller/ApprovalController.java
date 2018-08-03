package com.jdl.css.approval.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.approval.model.service.ApprovalService;
import com.jdl.css.approval.model.vo.ApprovalVo;
import com.jdl.css.approval.model.vo.DjqanrldksVo;
import com.jdl.css.employee.model.vo.EmployeeVo;

@Controller
public class ApprovalController {
	
	@Autowired
	ApprovalService aService;
	
	@RequestMapping("approvalPage.do")
	public String openApprovalPage(){
		return "approval/approvalPage";
	}
	
	@RequestMapping("djqanrldksPage.do")
	public String openDjqanrldksPage(){
		return "approval/approvalForm/djqanrldks";
	}
	
	@RequestMapping("selectDraftApprovalList.do")
	public ModelAndView selectDraftApprovalList(ModelAndView mv,HttpSession session){
		EmployeeVo user = (EmployeeVo) session.getAttribute("user");
		List<ApprovalVo> draftList = aService.selectDraftApprovalList(user);
		System.out.println(draftList);
		mv.addObject("draftList", draftList);
		mv.setViewName("");
		return mv;
	}
	
	@RequestMapping("writeDjqanrldks.do")
	public void writeDjqanrldks(HttpSession session,DjqanrldksVo app){
		EmployeeVo user = (EmployeeVo) session.getAttribute("user");
		
	}

}
