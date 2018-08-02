package com.jdl.css.note.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.note.model.service.NoteService;
import com.jdl.css.note.model.vo.NoteVo;

@Controller
public class NoteController {
	
	@Autowired
	NoteService service;
	
	@RequestMapping("moveNote.do")
	public String moveNote(){
		return "note/noteMain";
	}
	
	@RequestMapping("writeNote.do")
	public String writeNote(){
		
		return "note/writeNote";
	}
	@RequestMapping("sendNote.do")
	public ModelAndView sendNote(NoteVo note ,ModelAndView mv){
		
		System.out.println(note);
//		int result = service.insertNote(note);
		
		
		System.out.println("도착");
		Map<String, Object> receive = new HashMap<String, Object>();
		receive.put("rnNoteFk", note.getSnKey());
		
		
		
		int result = service.insertReceiveNote(note);
		
		System.out.println("result = "+result);
		mv.setViewName("note/writeNote");
		
		return mv;
	};
}
