package cn.com.bean;

public class appointmentinfo {
	//预约表
	public String appointmentNo;
	//预约编号
	public String appointmentDate;
	//预约状态
	public roominfo roomNo;
	//预约房屋号
	public userinfo appointmenter;
	//预约人id
	public userinfo saler;
	//出租方id
	public String appointmentState;
	//状态
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
