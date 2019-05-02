package cn.com.bean;

public class contractinfo {
	//合同表
	public String contractNo;
	//合同编号
	public String contractState;
	//合同状态
	public String contractSignDate;
	//签订日期
	public roominfo roomNo;
	//签订房屋
	public String contractSignTime;
	//签订时长
	public userinfo buyer;
	//签定方
	public userinfo saler;
	//放租方
	private String contractPicture;
	//存根照片地址
	private float contractPrice;
	
	public float getContractPrice() {
		return contractPrice;
	}
	public void setContractPrice(float contractPrice) {
		this.contractPrice = contractPrice;
	}
	public String getContractNo() {
		return contractNo;
	}
	public String getContractPicture() {
		return contractPicture;
	}
	public void setContractPicture(String contractPicture) {
		this.contractPicture = contractPicture;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractState() {
		return contractState;
	}
	public void setContractState(String contractState) {
		this.contractState = contractState;
	}
	public String getContractSignDate() {
		return contractSignDate;
	}
	public void setContractSignDate(String contractSignDate) {
		this.contractSignDate = contractSignDate;
	}
	public String getContractSignTime() {
		return contractSignTime;
	}
	public void setContractSignTime(String contractSignTime) {
		this.contractSignTime = contractSignTime;
	}
	public roominfo getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(roominfo roomNo) {
		this.roomNo = roomNo;
	}
	public userinfo getBuyer() {
		return buyer;
	}
	public void setBuyer(userinfo buyer) {
		this.buyer = buyer;
	}
	public userinfo getSaler() {
		return saler;
	}
	public void setSaler(userinfo saler) {
		this.saler = saler;
	}
	
	
}
