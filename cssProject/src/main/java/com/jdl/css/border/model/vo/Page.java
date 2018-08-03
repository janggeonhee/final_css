package com.jdl.css.border.model.vo;

import java.sql.Date;

public class Page extends Pagination {
	 private Integer seq;
	 private String title;
	 private String name;
	 private String contents;
	 private Date recodeDate;
	 private Integer hit;
	 
	 public Page(){
		 
	 }

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRecodeDate() {
		return recodeDate;
	}

	public void setRecodeDate(Date recodeDate) {
		this.recodeDate = recodeDate;
	}

	public Integer getHit() {
		return hit;
	}

	public void setHit(Integer hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "Page [seq=" + seq + ", title=" + title + ", name=" + name + ", contents=" + contents + ", recodeDate="
				+ recodeDate + ", hit=" + hit + "]";
	}
	 
}
