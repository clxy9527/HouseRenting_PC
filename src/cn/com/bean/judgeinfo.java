package cn.com.bean;

public class judgeinfo {
	// ���۱�
	public String judgeNo;
	// ���۱��
	public appointmentinfo appointmentNo;
	// ���ݱ��
	public userinfo userNo;
	// �����û����
	public String judge;
	// ��������
	public String judgeState;
	// ����״̬
	public String judgeDate;
	// ����ʱ��

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
