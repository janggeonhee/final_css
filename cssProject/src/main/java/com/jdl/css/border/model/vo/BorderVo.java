package com.jdl.css.border.model.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BorderVo {
	
	private int boardKey; //게시판 기본키
	private String companyKey; //회사키
	private String bTitle; //게시글 제목
	private String bContent; //글내용
	private String bWriter; //작성자
	private int bCount; //조회수
	private Date bDate; //작성일
	private String bCateGory; //게시판 종류
	
	public BorderVo(){
		
	}

	public BorderVo(int boardKey, String companyKey, String bTitle, String bContent, String bWriter, int bCount,
			Date bDate, String bCateGory) {
		this.boardKey = boardKey;
		this.companyKey = companyKey;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
		this.bCount = bCount;
		this.bDate = bDate;
		this.bCateGory = bCateGory;
	}

	public int getBoardKey() {
		return boardKey;
	}

	public void setBoardKey(int boardKey) {
		this.boardKey = boardKey;
	}

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public int getbCount() {
		return bCount;
	}

	public void setbCount(int bCount) {
		this.bCount = bCount;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public String getbCateGory() {
		return bCateGory;
	}

	public void setbCateGory(String bCateGory) {
		this.bCateGory = bCateGory;
	}

	@Override
	public String toString() {
		return "BorderVo [boardKey=" + boardKey + ", companyKey=" + companyKey + ", bTitle=" + bTitle + ", bContent="
				+ bContent + ", bWriter=" + bWriter + ", bCount=" + bCount + ", bDate=" + bDate + ", bCateGory="
				+ bCateGory + "]";
	}

}