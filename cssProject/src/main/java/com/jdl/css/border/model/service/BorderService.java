package com.jdl.css.border.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdl.css.border.model.dao.BorderDao;
import com.jdl.css.border.model.vo.BorderVo;

@Service
public class BorderService {

	@Autowired
	BorderDao dao;

	public List<BorderVo> getNoticeList(String bCateGory) {
		return dao.borderListSelect(bCateGory);
	}

	public int writeBoard(BorderVo board){
		return dao.writeBoard(board);
	}

	public BorderVo selectBoard(int boardKey) {
		return dao.selectBoard(boardKey);
	}

	public int updateBoard(BorderVo border) {
		return dao.updateBoard(border);
	}


}
