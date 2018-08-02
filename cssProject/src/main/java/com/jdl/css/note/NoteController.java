package com.jdl.css.note;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {
	
	
	@RequestMapping("moveNote.do")
	public String moveNote(){
		return "note/noteMain";
	}
	
	@RequestMapping("writeNote.do")
	public String writeNote(){
		
		return "note/writeNote";
	}
	
}
