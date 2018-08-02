package com.jdl.css.member.model.vo;

import java.util.Date;

public class Member {

	private int memberNo;
	private String memberName;
	private String memberPwd;
	private int jobcode;
	private int depart;
	private String memberAddress;
	private int exten;
	private String memberPhone;
	private String memberEmail;
	private Date hireDate;
	private String memberPhoto;
	
	
	public Member(){
		
	}
	
	public Member(int memberNo, String memberName, String memberPwd, int jobcode, int depart, String memberAddress,
			int exten, String memberPhone, String memberEmail, Date hireDate, String memberPhoto) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPwd = memberPwd;
		this.jobcode = jobcode;
		this.depart = depart;
		this.memberAddress = memberAddress;
		this.exten = exten;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.hireDate = hireDate;
		this.memberPhoto = memberPhoto;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public int getJobcode() {
		return jobcode;
	}

	public void setJobcode(int jobcode) {
		this.jobcode = jobcode;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public int getExten() {
		return exten;
	}

	public void setExten(int exten) {
		this.exten = exten;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getMemberPhoto() {
		return memberPhoto;
	}

	public void setMemberPhoto(String memberPhoto) {
		this.memberPhoto = memberPhoto;
	}

	
	
	
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", memberPwd=" + memberPwd + ", jobcode="
				+ jobcode + ", depart=" + depart + ", memberAddress=" + memberAddress + ", exten=" + exten
				+ ", memberPhone=" + memberPhone + ", memberEmail=" + memberEmail + ", hireDate=" + hireDate
				+ ", memberPhoto=" + memberPhoto + "]";
	}
	

	
	
	
}
