package com.jdl.css.border.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jdl.css.border.model.service.BorderService;
import com.jdl.css.border.model.vo.BorderVo;
import com.jdl.css.border.model.vo.Page;

@Controller
public class BorderController {

	@Autowired
	BorderService borderservice;
	
	@RequestMapping("borderList.do")
	public ModelAndView boaderList(int bType, ModelAndView mv){
		
		String bCateGory = getBCategory(bType);
		
		List<BorderVo> list = borderservice.getNoticeList(bCateGory);
		if(list != null){
			mv.addObject("list", list);
			mv.addObject("bCateGory",bCateGory);
			mv.addObject("bType",bType);
			mv.setViewName("border/borderList");
		}
		return mv;
	}

	private String getBCategory(int bType) {
		String bCateGory;
		switch(bType){
		case 1:
			bCateGory = "공지사항";
			break;
		case 2:
			bCateGory = "자유 게시판";
			break;
		case 3:
			bCateGory = "경조사";
			break;
		default:
			bCateGory = "자유 게시판";
			break;
		}
		return bCateGory;
	}
	
	@RequestMapping("borderForm.do")
	public ModelAndView borderForm(BorderVo board, ModelAndView mv){
		
		mv.addObject("board", board);
		mv.setViewName("border/borderForm");
		return mv;
	}
	
	@RequestMapping("writeBoard.do")
	public ModelAndView writeBoard(BorderVo board, ModelAndView mv, HttpServletResponse response){
			int result = borderservice.writeBoard(board);
			
			if(result > 0){
				//response.setHeader("Content-Type", "application/xml");
//				response.setContentType("text/html;charset=UTF-8");
				//response.setCharacterEncoding("utf-8"); 
				mv.setViewName("redirect:borderList.do?bType="+getBType(board));
			}
		return mv;
	}

	private int getBType(BorderVo board) {
		int bType = 0;
		if(board.getbCateGory().equals("공지사항")){
			bType = 1;
		}else if(board.getbCateGory().equals("자유 게시판")){
			bType = 2;
		}else if(board.getbCateGory().equals("경조사")){
			bType = 3;
		}else{
			bType = 2;
		}
		return bType;
	}
	
	@RequestMapping("selectBoard.do")
	public ModelAndView selectBoard(BorderVo b, ModelAndView mv){
		
		BorderVo board = borderservice.selectBoard(b.getBoardKey());
		board.setbType(getBType(board));
		if(board != null){
			mv.addObject("board", board);
			mv.setViewName("border/borderDetail");
		}
		return mv;
	}
	
	@RequestMapping("updateBorder.do")
	public ModelAndView updateBorder(BorderVo border, ModelAndView mv, HttpServletResponse response){
		
		System.out.println(border);
		int result = borderservice.updateBoard(border);
		if(result > 0){
//			response.setHeader("Content-Type", "application/xml");
//			response.setContentType("text/xml;charset=UTF-8");
//			response.setCharacterEncoding("utf-8"); 
			mv.setViewName("redirect:borderList.do?bType="+getBType(border));
		}
		return mv;
	}
	
	@RequestMapping("Board.do")
	public ModelAndView board(Page p, ModelAndView mv){
		
//		p.setTotalItemCount(borderservice.countBoardList(p)); //아이템의 총 갯수를 넣어줍니다. (필수사항)
//		p.setItemPerPage(10);   //선택사항
		
		return mv;
	}
}
