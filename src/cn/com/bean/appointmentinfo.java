package cn.com.bean;

public class appointmentinfo {
	//ԤԼ��
	public String appointmentNo;
	//ԤԼ���
	public String appointmentDate;
	//ԤԼ״̬
	public roominfo roomNo;
	//ԤԼ���ݺ�
	public userinfo appointmenter;
	//ԤԼ��id
	public userinfo manger;
	//�н����Աid
	public userinfo saler;
	//���ⷽid
	public String appointmentState;
	//״̬
	public String getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(String appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public roominfo getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(roominfo roomNo) {
		this.roomNo = roomNo;
	}
	public userinfo getAppointmenter() {
		return appointmenter;
	}
	public void setAppointmenter(userinfo appointmenter) {
		this.appointmenter = appointmenter;
	}
	public userinfo getManger() {
		return manger;
	}
	public void setManger(userinfo manger) {
		this.manger = manger;
	}
	public userinfo getSaler() {
		return saler;
	}
	public void setSaler(userinfo saler) {
		this.saler = saler;
	}
	public String getAppointmentState() {
		return appointmentState;
	}
	public void setAppointmentState(String appointmentState) {
		this.appointmentState = appointmentState;
	}
	
}
