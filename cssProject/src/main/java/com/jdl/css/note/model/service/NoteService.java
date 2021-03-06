package com.jdl.css.note.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdl.css.note.model.dao.NoteDao;
import com.jdl.css.note.model.vo.NoteVo;


@Service
public class NoteService {
	@Autowired
	NoteDao dao;

	public int insertNote(NoteVo note) {
		return dao.insertNote(note);
	}

	public int insertReceiveNote(NoteVo note) {
		int result = 0;
		for(Integer i : note.getReceiveNo()){
			note.setReceiver(i);
			result = dao.insertReceiveNote(note);			
		}
		return result;
	}


}
