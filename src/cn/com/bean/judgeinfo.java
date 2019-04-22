package cn.com.bean;

public class judgeinfo {
	//评价表
	public String judegNo;
	//评价编号
	public roominfo roomNo;
	//房屋编号
	public userinfo userNo;
	//评价用户编号
	public String judeg;
	//评价内容
	public String judegState;
	//评价状态
	public String getJudegNo() {
		return judegNo;
	}
	public void setJudegNo(String judegNo) {
		this.judegNo = judegNo;
	}
	public roominfo getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(roominfo roomNo) {
		this.roomNo = roomNo;
	}
	public userinfo getUserNo() {
		return userNo;
	}
	public void setUserNo(userinfo userNo) {
		this.userNo = userNo;
	}
	public String getJudeg() {
		return judeg;
	}
	public void setJudeg(String judeg) {
		this.judeg = judeg;
	}
	public String getJudegState() {
		return judegState;
	}
	public void setJudegState(String judegState) {
		this.judegState = judegState;
	}
	

}
