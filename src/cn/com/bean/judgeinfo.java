package cn.com.bean;

public class judgeinfo {
	// 评价表
	public String judgeNo;
	// 评价编号
	public appointmentinfo appointmentNo;
	// 房屋编号
	public userinfo userNo;
	// 评价用户编号
	public String judge;
	// 评价内容
	public String judgeState;
	// 评价状态
	public String judgeDate;
	// 评价时间

	public appointmentinfo getAppointmentNo() {
		return appointmentNo;
	}

	public String getJudgeNo() {
		return judgeNo;
	}

	public void setJudgeNo(String judgeNo) {
		this.judgeNo = judgeNo;
	}

	public void setAppointmentNo(appointmentinfo appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public userinfo getUserNo() {
		return userNo;
	}

	public void setUserNo(userinfo userNo) {
		this.userNo = userNo;
	}

	public String getJudgeState() {
		return judgeState;
	}

	public void setJudgeState(String judgeState) {
		this.judgeState = judgeState;
	}

	public String getJudgeDate() {
		return judgeDate;
	}

	public void setJudgeDate(String judgeDate) {
		this.judgeDate = judgeDate;
	}

	public String getJudge() {
		return judge;
	}

	public void setJudge(String judge) {
		this.judge = judge;
	}

}
