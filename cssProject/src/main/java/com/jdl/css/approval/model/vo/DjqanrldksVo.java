package com.jdl.css.approval.model.vo;

import org.springframework.stereotype.Component;

@Component
public class DjqanrldksVo {
	private String a1;
	private String a2;
	private String a3;
	private String a4;
	
	public DjqanrldksVo() {
		// TODO Auto-generated constructor stub
	}
	public DjqanrldksVo(String a1, String a2, String a3, String a4) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}

	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	public String getA3() {
		return a3;
	}
	public void setA3(String a3) {
		this.a3 = a3;
	}
	public String getA4() {
		return a4;
	}
	public void setA4(String a4) {
		this.a4 = a4;
	}
	@Override
	public String toString() {
		return "DjqanrldksVo [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + "]";
	}

}
